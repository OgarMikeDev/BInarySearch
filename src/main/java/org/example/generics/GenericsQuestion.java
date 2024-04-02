package org.example.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsQuestion {
    static List<Manager> list = new ArrayList<>();



    public static void main(String []args) {
        Manager manager = new Manager();
        manager.setName("Misha");
        manager.setPrice(50_000);
        manager.setBonus(10_000);
        list.add(manager);

        GenericsQuestion.print(list);
    }


    public static void print(List<? extends Employee> list) {
        System.out.println(list.toString());
    }
}
