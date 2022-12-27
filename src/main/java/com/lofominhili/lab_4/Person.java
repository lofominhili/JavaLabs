package com.lofominhili.lab_4;

/**
 * A class that contains division data
 *
 * @author Danila Bakulin
 * @version 1.0
 */
public class Person {

    /**
     * @value ID of Person
     */
    private final long id;

    /**
     * @value name of Person
     */
    private final String name;

    /**
     * @value gender of Person
     */
    private final String gender;

    /**
     * @value birthDate of Person
     */
    private final String birthDate;

    /**
     * @value division of Person
     */
    private final Division division;

    /**
     * @value salary of Person
     */
    private final int salary;

    /**
     * Constructor - creating a new object
     *
     * @param id        id that we get from CSV file
     * @param name      name that we get from CSV file
     * @param gender    gender that we get from CSV file
     * @param birthDate birthDate that we get from CSV file
     * @param division  division that we create in {@link CSVParser}
     * @param salary    salary that we get from CSV file
     */
    public Person(long id, String name, String gender, String birthDate, Division division, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.division = division;
        this.salary = salary;
    }

    /**
     * Redefining the function{@link String#toString()} that will output the variables
     */
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", division=" + division +
                ", salary=" + salary +
                '}';
    }
}
