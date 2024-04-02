package org.example.Inheritance;

import java.time.LocalDate;

public class Manager extends Employee {
    private int bonus;


    public Manager(String name, int salary, LocalDate hireDay) {
        super(name, salary, hireDay);
    }


    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
