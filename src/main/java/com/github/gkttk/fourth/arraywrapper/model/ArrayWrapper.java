package com.github.gkttk.fourth.arraywrapper.model;

import java.util.Arrays;
import java.util.List;

/**
 * Class - wrapper which stores internal array of integer.
 */
public class ArrayWrapper {

    private int[] mainArray;
    private int size;

    public ArrayWrapper(int initCapacity) {
        this.size = initCapacity;
        this.mainArray = new int[initCapacity];
    }

    public ArrayWrapper(int[] mainArray) {
        this.size = mainArray.length;
        this.mainArray = mainArray;
    }

    public ArrayWrapper(List<Integer> listOfNumbers) {
        this.size = listOfNumbers.size();
        this.mainArray = new int[size];
        for (int i = 0; i < size; i++) {
            int element = listOfNumbers.get(i);
            mainArray[i] = element;
        }
    }


    public int getElementByIndex(int index) {
        return mainArray[index];
    }

    public void setElement(int element, int index) {
        mainArray[index] = element;
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
        ArrayWrapper arrayWrapper = (ArrayWrapper) comparedObject;
        if (this.getSize() != arrayWrapper.getSize()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.getElementByIndex(i) != arrayWrapper.getElementByIndex(i)) {
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
