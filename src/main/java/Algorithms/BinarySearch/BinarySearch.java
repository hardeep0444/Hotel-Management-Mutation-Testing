package Algorithms.BinarySearch;

public class BinarySearch {


    public static boolean binarySearchRecursive(int[] array, int key, int start, int end) {
        if(array.length==0) return false;
        int middle = (start + end) / 2;

        if (end < start) {
            return false;
        }

        if (key < array[middle]) {
            return binarySearchRecursive(array, key, start, middle - 1);
        } else if (key > array[middle]) {
            return binarySearchRecursive(array, key, middle + 1, end);
        } else if (key == array[middle]) {
            return true;
        }

        return false;
    }

    /**
     * @param array A sorted array of ints to search through. This must be sorted.
     * @param key   an int to seach the array for
     * @return wheter the key exists in the array
     */
    public static boolean binarySearchIterative(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (key < array[middle]) {
                end = middle - 1;
            } else if (key > array[middle]) {
                start = middle + 1;
            } else if (key == array[middle]) {
                return true;
            }
        }
        return false;
    }
}