package org.example.generics;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private int price;

    private String name;


    public String toString() {
        return getName() + " - " + getPrice();
    }
}
