package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

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
        for (Person person : people) {
            if (name.toLowerCase().contains(person.getName().toLowerCase())) {
                return person.getName();
            }
        }
        return null;
    }
    public static void ageComparisons (List<Person> people) {
        int averageAge = 0;
        int sum = 0;
        int oldestAge = 0;
        int youngestAge = 0;
        for (int i = 0; i < people.size(); i++) {
            if (i < 1) {
                youngestAge = people.get(i).getAge();
                oldestAge = people.get(i).getAge();
                continue;
            }
            oldestAge = Math.max(oldestAge, people.get(i).getAge());
            youngestAge = Math.min(youngestAge, people.get(i).getAge());
            sum += people.get(i).getAge();
            averageAge = sum / i;
        }
        System.out.println(averageAge + "|" + oldestAge + "|" + youngestAge);
    }


    @Override
    public String toString() {
        return name + ", " + lastName + ", " + age;
    }
}
