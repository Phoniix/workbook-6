package com.pluralsight;

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

    @Override
    public String toString() {
        return name + ", " + lastName + ", " + age;
    }
}
