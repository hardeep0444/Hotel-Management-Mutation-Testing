package org.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.*;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Unit test for simple App.
 */
@RunWith(MockitoJUnitRunner.class)
public class AppTest 
    extends TestCase
{
    @Test
    public void testFeatures() {
        // Arrange
        int option1 = 1;
        int option2 = 2;
        int option3 = 3;
        int option4 = 4;
        int invalidOption = 5;

//        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStreamCaptor));
        // Act
        String result1 = Hotel.features(option1);
        String result2 = Hotel.features(option2);
        String result3 = Hotel.features(option3);
        String result4 = Hotel.features(option4);
        String invalidResult = Hotel.features(invalidOption);

        // Assert
        assertEquals("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000 ", result1);
//        assertEquals("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000\r\n", outputStreamCaptor.toString());
        assertEquals("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3000  ", result2);
        assertEquals("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2200  ", result3);
        assertEquals("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ", result4);
        assertEquals("Enter valid option", invalidResult);

    }

    @Test
    public void testAvailability()
    {
        int option1 = 1;
        int option2 = 2;
        int option3 = 3;
        int option4 = 4;
        int invalidOption = 5;

        //Luxury Doubleroom- option1
        Hotel.lockRoom(option1,"xyz","xyz","M","xwe","cv","F",4);
        Hotel.lockRoom(option1,"xyz","xyz","M","xwe","cv","F",1);
        Hotel.lockRoom(option1,"xyz","xyz","M","xwe","cv","F",7);
        assertEquals(7,Hotel.availability(option1));

        //Deluxe Doubleroom- option2
        Hotel.lockRoom(option2,"xyz","xyz","M","xwe","cv","F",12);
        Hotel.lockRoom(option2,"xyz","xyz","M","xwe","cv","F",13);
        Hotel.lockRoom(option2,"xyz","xyz","M","xwe","cv","F",12);
        assertEquals(18,Hotel.availability(option2));

        //Luxury Singleroom- option3
        Hotel.lockRoom(option3,"xyz","xyz","M",null,null,"",2);
        Hotel.lockRoom(option3,"xyz","xyz","M",null,null,"",1);
        Hotel.lockRoom(option3,"xyz","xyz","M",null,null,"",7);
        assertEquals(7,Hotel.availability(option3));

        //deluxe Singleroom- option4
        Hotel.lockRoom(option4,"xyz","xyz","M",null,null,"",4);
        Hotel.lockRoom(option4,"xyz","xyz","M",null,null,"",5);
        Hotel.lockRoom(option4,"xyz","xyz","M",null,null,"",1);
        assertEquals(17,Hotel.availability(option4));

        //invalidOption
        assertEquals(0,Hotel.availability(invalidOption));
    }


    private final InputStream originalSystemIn = System.in;

    @BeforeEach
    public void setUp() {
        // Set up a mock InputStream and mock System.in
        InputStream mockInputStream = new ByteArrayInputStream("John\n1234567890\nMale\nJane\n9876543210\nFemale\n".getBytes());
        System.setIn(mockInputStream);
    }

    @AfterEach
    public void tearDown() {
        // Restore the original System.in after each test
        System.setIn(originalSystemIn);
    }

    @Test
    public void testCustDetails() {
        // Create an instance of the Hotel class
        Hotel hotel = new Hotel();

        // Set up a mock InputStream and mock System.in
        InputStream mockInputStream = new ByteArrayInputStream("John\n1234567890\nMale\nJane\n9876543210\nFemale\n".getBytes());
        Scanner mockScanner = new Scanner(mockInputStream);
        hotel.CustDetails(1, 0, mockScanner);

        // Perform assertions based on the expected behavior
        assertNotNull(Hotel.hotel_ob.luxury_doublerrom[0]); // Assuming the room is booked
        // Add more assertions if needed
    }

}
