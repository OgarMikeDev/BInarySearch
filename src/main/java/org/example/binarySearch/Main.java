package org.example.binarySearch;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 0;
        int end = numbers.length - 1;
        int middle = end / 2;
        int query = 8;

        while (true) {
            if (query == numbers[middle]) {
                System.out.println("Element " + numbers[middle] + " found!");
                break;
            } else if (query < numbers[middle]) {
                end = middle - 1;
                middle = start + (end - start) / 2;
            } else if (query > numbers[middle]) {
                start = middle + 1;
                middle = start + (end - start) / 2;
            }
        }
    }
}
