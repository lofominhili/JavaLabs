package com.lofominhili.lab_1;

import java.util.Arrays;
import java.util.Objects;

/**
 * A Container class that can store, add, remove, and retrieve items from this container
 *
 * @version 1.0
 * @author Danila Bakulin
 */
public class Container<T> {
    /**
     * @value Field - Standard Container Size
     */
    private static final int DEFAULT_SIZE = 10;
    /**
     * @value Field - current Container size
     */
    private int size;
    /**
     * @value Field - container implemented via array
     */
    private Object[] array;
    /**
     * @value Field - which can be used to access the elements of the container
     */
    private int indexOfElements;

    /**
     * Constructor - creating a new object
     *
     * @see Container#Container(int size)
     */
    public Container() {
        this.size = DEFAULT_SIZE;
        this.array = new Object[size];
        this.indexOfElements = 0;
    }

    /**
     * Constructor - Create a new object with defined values
     *
     * @param size the size that the user entered
     * @see Container#Container()
     */
    public Container(int size) {
        this.size = size;
        this.array = new Object[size];
        this.indexOfElements = 0;
    }

    /**
     * Function to get the field value by index.
     * My function uses a method from the standard java library {@link Objects#checkIndex(int, int)}
     *
     * @param index index received from the user, by which we get the Container object
     * @return Returns the container object
     */
    public Object getElementAt(int index) {
        Objects.checkIndex(index, size);
        return array[index];
    }

    /**
     * Function to add an item to a Container.
     * My function uses a method called reSize {@link Container#reSize()}
     *
     * @param element object(value) received from the user, which is added to the container
     */
    public void addElement(Object element) {
        array[indexOfElements++] = element;
        reSize();
    }

    /**
     * Function to add an item to a Container by index.
     * My function uses a method from the standard java library {@link Objects#checkIndex(int, int)}
     * My function uses a method called reSize {@link Container#reSize()}
     * My function uses a method from the standard java library {@link System#arraycopy(Object, int, Object, int, int)}
     *
     * @param element object(value) received from the user, which is added to the container
     * @param index   index received from the user, by which the element will be inserted
     */
    public void addElementAt(Object element, int index) {
        Objects.checkIndex(index, size);
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, size - index - 1);
        array = newArray;
        if (index <= indexOfElements)
            indexOfElements++;
        reSize();
    }

    /**
     * Function to remove an item from Container by index.
     * My function uses a method from the standard java library {@link Objects#checkIndex(int, int)}
     * My function uses a method from the standard java library {@link System#arraycopy(Object, int, Object, int, int)}
     *
     * @param index index received from the user, by which the element will be inserted
     */
    public void removeElementAt(int index) {
        Objects.checkIndex(index, size);
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, size - index - 1);
        array = newArray;
        indexOfElements -= 1;
    }

    /**
     * Function to get size of Container.
     *
     * @return Returns size of Container
     */
    public int getSize() {
        return size;
    }

    /**
     * Function to get the index Of Elements.
     *
     * @return Returns index Of Elements
     */
    public int getIndexOfElements() {
        return indexOfElements;
    }

    /**
     * Function to set the size of Container.
     *
     * @param size the size that the user entered
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Function to set the index Of Elements.
     *
     * @param indexOfElements the index Of Elements that the user entered
     */
    public void setIndexOfElements(int indexOfElements) {
        this.indexOfElements = indexOfElements;
    }

    /**
     * Function which increases the size of the container when the index of the items exceeds the size of the container.
     * My function uses a method from the standard java library {@link System#arraycopy(Object, int, Object, int, int)}
     */
    private void reSize() {
        if (indexOfElements == size) {
            size *= 2;
            Object[] newArray = new Object[size];
            System.arraycopy(array, 0, newArray, 0, size / 2);
            array = newArray;
        }
    }

    /**
     * Redefining the function{@link String#toString()} that will output the container items
     */
    public String toString() {
        return "Container = " + Arrays.toString(array);
    }
}
