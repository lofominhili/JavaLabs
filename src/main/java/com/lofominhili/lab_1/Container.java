package com.lofominhili.lab_1;

import java.util.Arrays;
import java.util.Objects;


public class Container<T> {
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private Object[] array;
    private int indexOfElements;

    public Container() {
        this.size = DEFAULT_SIZE;
        this.array = new Object[size];
        this.indexOfElements = 0;
    }

    public Container(int size) {
        this.size = size;
        this.array = new Object[size];
        this.indexOfElements = 0;
    }

    public Object getElementAt(int index) {
        Objects.checkIndex(index, size);
        return array[index];
    }

    public void addElement(Object element) {
        array[indexOfElements++] = element;
        reSize();
    }

    public void addElementAt(Object element, int index) {
        Objects.checkIndex(index, size);
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, size - index - 1);
        array = newArray;
        if (index < indexOfElements)
            indexOfElements++;
        reSize();
    }

    public void removeElementAt(int index) {
        Objects.checkIndex(index, size);
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, size - index - 1);
        array = newArray;
        indexOfElements -= 1;
    }

    public int getSize() {
        return size;
    }

    public int getIndexOfElements() {
        return indexOfElements;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setIndexOfElements(int indexOfElements) {
        this.indexOfElements = indexOfElements;
    }

    private void reSize() {
        if (indexOfElements == size) {
            size *= 2;
            Object[] newArray = new Object[size];
            System.arraycopy(array, 0, newArray, 0, size / 2);
            array = newArray;
        }
    }

    public String toString() {
        return "Container = " + Arrays.toString(array);
    }
}
