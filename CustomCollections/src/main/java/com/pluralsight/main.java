package com.pluralsight;

public class main {

    public static void main(String[] args) {
        FixedList<String> newList = new FixedList<>(4);
        newList.add("Sean");
        newList.add("Melchior");
        newList.add("Vic");
        newList.add("Mill");
        System.out.println(newList.getItems());

    }
}
