package Calculator;

import java.util.*;
import java.io.*;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import java.text.DecimalFormat;

public class Calculator {
    public static double sqrt(double a){
        double c=0;
        if(a<0)
            c=-1;
        else
            c = Math.sqrt(a);
        return c;
    }
    public static Double fact(int f){
        double result = 1;
//        logger.info("Calculating factorial  of given number:" + f);
        if(f<0)
            result=-1;
        else {
            try {
                if (f == 0 || f == 1) return 1.0;

                for (int i = 1; i <= f; i++) {
                    result *= i;
                }
            }
            catch (Exception e) {
//                logger.info("Exception occured");
            }
        }
//        logger.info("Resultant answer of power operations is : " + result);
        return result;
    }
    public static double log(double a){
        double c=0;
//        logger.info("Calculating natural log  of given number:" + a);
        if(a<=0)
            c=-1;
        else
            c = Math.log(a);
//        logger.info("Resultant answer of natural log operation is : " + c);
        return c;
    }
    public static double pow ( double a, double b){
        double c=0;
//        logger.info("Calculating power function of given numbers:" + a+","+b);
        if (a == 0)
            return 0;
        if (b == 0)
            return 1;
        try {
            c = Math.pow(a, b);
        }
        catch(Exception e) {
//            logger.info("Exception occured");
        }
//        logger.info("Resultant answer of power operation is : " + c);
        return c;
    }
}