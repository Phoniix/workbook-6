package com.pluralsight;

public class Person implements Comparable{
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Person other) {
            int lastNameCompare = this.lastName.compareToIgnoreCase(other.lastName);
            if (lastNameCompare != 0) return lastNameCompare;

        }
        return 0;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ", " + age;
    }

    private enum factor {
        AGE,
        LAST_NAME,
        FIRST_NAME;
    }

}
