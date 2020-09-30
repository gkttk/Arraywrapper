package com.github.gkttk.fourth.arraywrapper.model;

import com.github.gkttk.fourth.arraywrapper.exception.WrongIndexException;

import java.util.Arrays;
import java.util.List;

/**
 * Class - wrapper which stores internal array of integer.
 */
public class Array {

    private int[] mainArray;
    private int size;

    public Array(int initCapacity) {
        this.size = initCapacity;
        this.mainArray = new int[initCapacity];
    }

    public Array(int[] mainArray) {
        this.size = mainArray.length;
        this.mainArray = mainArray;
    }

    public Array(List<Integer> listOfNumbers) {
        this.size = listOfNumbers.size();
        this.mainArray = new int[size];
        for (int i = 0; i < size; i++) {
            int element = listOfNumbers.get(i);
            mainArray[i] = element;
        }
    }


    public int getElementByIndex(int index) {
        if (index >= 0 && index < mainArray.length) {
            return mainArray[index];
        } else {
            throw new WrongIndexException("This index is out of range", index);
        }
    }

    public void setElement(int element, int index) {
        if (index >= 0 && index < mainArray.length) {
            mainArray[index] = element;
        } else {
            throw new WrongIndexException("This index is out of range", index);
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        if (comparedObject == null || getClass() != comparedObject.getClass()) {
            return false;
        }
        Array array = (Array) comparedObject;
        if (this.getSize() != array.getSize()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.getElementByIndex(i) != array.getElementByIndex(i)) {
                return false;
            }
        }
        return true;
    }


    @Override
    public int hashCode() {
        return Arrays.hashCode(mainArray);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < mainArray.length; i++) {
            if (i < mainArray.length - 1) {
                stringBuilder.append(mainArray[i]).append(" ");
            } else {
                stringBuilder.append(mainArray[i]);
            }
        }
        return stringBuilder.toString();
    }
}
