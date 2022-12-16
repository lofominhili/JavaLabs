package com.lofominhili.lab_3;

import com.lofominhili.lab_1.Container;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * A Container class that that tests methods for time of {@link ArrayList} and {@link LinkedList} collections
 *
 * @version 1.0
 * @author Danila Bakulin
 */
public class MethodTester {

    /**
     * @value {@link ArrayList}
     */
    private final List<Integer> arrayList;

    /**
     * @value {@link LinkedList}
     */
    private final List<Integer> linkedList;

    /**
     * @value Amount of tests
     */
    private final int amount;

    /**
     * Constructor which initializes lists and assigns a value to amount
     *
     * @param amount Amount of tests
     */
    public MethodTester(int amount) {
        this.arrayList = new ArrayList<>();
        this.linkedList = new LinkedList<>();
        this.amount = amount;
    }

    /**
     * Function that counts how long the standard methods of ArrayList take.
     */
    private void clockInArrayList() {
        long addStartTime = System.currentTimeMillis();
        for (int i = 0; i < amount; i++)
            arrayList.add(i);
        System.out.println(String.format("|add|\t %d\t%d ms", amount, System.currentTimeMillis() - addStartTime));

        long getStartTime = System.currentTimeMillis();
        for (int i = 0; i < amount; i++)
            arrayList.get(i);
        System.out.println(String.format("|get|\t %d\t%d ms", amount, System.currentTimeMillis() - getStartTime));

        long removeStartTime = System.currentTimeMillis();
        for (int i = 0; i < amount; i++)
            arrayList.remove(Integer.valueOf(i));
        System.out.println(String.format("|delete| %d\t%d ms\n", amount, System.currentTimeMillis() - removeStartTime));
    }

    /**
     * Function that counts how long the standard methods of LinkedList take.
     */
    private void clockInLinkedList() {
        long addStartTime = System.currentTimeMillis();
        for (int i = 0; i < amount; i++)
            linkedList.add(i);
        System.out.println(String.format("|add|\t %d\t%d ms", amount, System.currentTimeMillis() - addStartTime));

        long getStartTime = System.currentTimeMillis();
        for (int i = 0; i < amount; i++)
            linkedList.get(i);
        System.out.println(String.format("|get|\t %d\t%d ms", amount, System.currentTimeMillis() - getStartTime));

        long removeStartTime = System.currentTimeMillis();
        for (int i = 0; i < amount; i++)
            linkedList.remove(Integer.valueOf(i));
        System.out.println(String.format("|delete| %d\t%d ms", amount, System.currentTimeMillis() - removeStartTime));
    }

    /**
     * A method that shows the table with results
     */
    public void displayResults() {
        System.out.println("\t\tArray List\n");
        System.out.println("Method\tAmount\tTime\n");
        clockInArrayList();
        System.out.println("\t\tLinked List\n");
        System.out.println("Method\tAmount\tTime\n");
        clockInLinkedList();
    }

}
