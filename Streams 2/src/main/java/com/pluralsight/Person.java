package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Person {
    final String name;
    final String lastName;
    final int age;

    Person (String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public static List<Person> loadPeople () {
        List<Person> allPeeps = new ArrayList<>();
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
        return allPeeps;
    }
    public static String findPersonByName  (List<Person> people, String name) {
        return people.stream()
                .filter(person -> person.getName().toLowerCase().contains(name.toLowerCase()))
                .map(Person::getName)
                .findFirst()
                .orElse(null);
    }
    public static void ageComparisons (List<Person> people) {
        double average = Double.parseDouble(String.valueOf(people.stream()
                .mapToInt(Person::getAge)
                .average()).replaceAll("[^A-Za-z0-9]+", "")
                .replaceAll("[A-Za-z]+", ""))
                / people.size();
        int oldestMF = Integer.parseInt(String.valueOf(people.stream()
                .mapToInt(Person::getAge)
                .max()).replaceAll("[^A-Za-z0-9]+", "")
                .replaceAll("[A-Za-z]+", "")
        );
        int theChild = Integer.parseInt(String.valueOf(people.stream()
                .mapToInt(Person::getAge)
                .min()).replaceAll("[^A-Za-z0-9]+", "")
                .replaceAll("[A-Za-z]+", "")
        );
        System.out.println(average + "|" + oldestMF + "|" + theChild);
    }


    @Override
    public String toString() {
        return name + ", " + lastName + ", " + age;
    }
}
