package org.example.enumTest;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a size: " + "\n(SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();

        Size size = Enum.valueOf(Size.class, input);
        System.out.println("Size: " + size);
    }
}
