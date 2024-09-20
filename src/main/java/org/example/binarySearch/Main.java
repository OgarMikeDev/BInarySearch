package org.example.binarySearch;

public class Main {
public static void main(String[] args) throws java.lang.Exception {
        // Your code goes here
                       //А  Б  В  Г  Д  Е  Ё  Ж  З  И
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 0;
        int end = numbers.length - 1;
        int middle = (start + end) / 2;
        int query = 6;

        while (true) {
            middle = (start + end) / 2;
            System.out.println("Middle: " + middle);
            if (query == numbers[middle]) {
                System.out.println("Element " + numbers[middle] + " found!");
                break;
            } else if (query < numbers[middle]) {
                end = middle - 1;
            } else if (query > numbers[middle]) {
                start = middle + 1;
            }
        }
    }
}
