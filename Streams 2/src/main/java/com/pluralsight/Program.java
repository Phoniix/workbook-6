package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> allPeeps = Person.loadPeople();

        String name = Person.findPersonByName(allPeeps, Design.getNounPrompt(scanner, true, "Enter name to search", false));
        System.out.println(name);
        Person.ageComparisons(allPeeps);
    }
}
