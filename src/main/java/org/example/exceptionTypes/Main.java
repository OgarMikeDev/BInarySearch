package org.example.exceptionTypes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        try {
            List<String> listAnimals = Files.readAllLines(Paths.get("src/main/resources/datfa.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
