package com.lofominhili.lab_4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Person> person = CSVParser.csvParser("src/main/resources/foreign_names.csv");
    person.forEach(System.out::println);
    }
}
