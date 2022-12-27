package com.lofominhili.lab_4;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A class that parses CSV table to {@link List} of {@link Person}
 *
 * @author Danila Bakulin
 * @version 1.0
 */
public class CSVParser {

    /**
     * A method that parses file to {@link List} of {@link Person}
     *
     * @param path A path to parsable file
     * @return {@link List} of {@link Person}
     */
    public static List<Person> csvParser(String path) {
        List<Person> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            long id = 1L;
            for (String s : reader.lines().filter(line -> line.charAt(0) != 'i').collect(Collectors.toList())) {
                String[] separated = s.split(";");
                Division division = new Division(id, separated[4].charAt(0));
                Person person = new Person(Long.parseLong(separated[0]), separated[1], separated[2], separated[3], division, Integer.parseInt(separated[5]));
                list.add(person);
                id++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
