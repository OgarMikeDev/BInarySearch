package org.example.generics;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Manager extends Employee {
    private int bonus;

    public void setBonus(int plusBonus) {
        bonus += plusBonus;
    }

    public String toString() {
        return getName() + " - " + getPrice() + " - " + getBonus();
    }
}
