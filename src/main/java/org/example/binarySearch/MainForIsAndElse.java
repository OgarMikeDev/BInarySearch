package org.example.binarySearch;

public class MainForIsAndElse {
    public static void main(String[] args) {
        int a = 10;

        int b = 10;

        if (a > b) {
            System.out.println("Число " + a + " больше числа " + b);
        } else if (a < b) {
            System.out.println("Число " + a + " меньше числа " + b);
        } else if (a == b) {
            System.out.println("Число " + a + " точно такое же, как и число " + b);
        } else {
            System.out.println("Число не подлежат сравнению!");
        }
    }
}
