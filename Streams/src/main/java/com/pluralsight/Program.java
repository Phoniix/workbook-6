package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> allPeeps = new ArrayList<>();
        allPeeps.add(new Person("Alice", "Johnson", 28));
        allPeeps.add(new Person("Bob", "Smith", 34));
        allPeeps.add(new Person("Carol", "Davis", 22));
        allPeeps.add(new Person("David", "Miller", 45));
        allPeeps.add(new Person("Eve", "Wilson", 31));
        allPeeps.add(new Person("Frank", "Moore", 27));
        allPeeps.add(new Person("Grace", "Taylor", 39));
        allPeeps.add(new Person("Henry", "Anderson", 52));
        allPeeps.add(new Person("Ivy", "Thomas", 19));
        allPeeps.add(new Person("Jack", "White", 40));

        String name = Design.getNounPrompt(scanner, true, "Enter name to search", false);
        for (Person person : allPeeps) {
            if (name.toLowerCase().contains(person.getName().toLowerCase())) {
                System.out.println(person.toString());
            }
        }
        int averageAge = 0;
        int sum = 0;
        int oldestAge = 0;
        int youngestAge = 0;
        for (int i = 0; i < allPeeps.size(); i++) {
            if (i < 1) {
                youngestAge = allPeeps.get(i).getAge();
                oldestAge = allPeeps.get(i).getAge();
                continue;
            }
            oldestAge = Math.max(oldestAge, allPeeps.get(i).getAge());
            youngestAge = Math.min(youngestAge, allPeeps.get(i).getAge());
            sum += allPeeps.get(i).getAge();
            averageAge = sum / i;
        }
        System.out.println(averageAge + "|" + oldestAge + "|" + youngestAge);
    }
}
