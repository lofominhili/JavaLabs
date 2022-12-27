package com.lofominhili.lab_4;

/**
 * A class that contains division data
 *
 * @author Danila Bakulin
 * @version 1.0
 */
public class Division {

    /**
     * @value ID of division
     */
    private final long id;

    /**
     * @value Name of division
     */
    private final char name;

    /**
     * Constructor - creating a new object
     *
     * @param id   id that we generate
     * @param name name that we get from CSV file
     */
    public Division(long id, char name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Redefining the function{@link String#toString()} that will output the variables
     */
    @Override
    public String toString() {
        return "Division{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
