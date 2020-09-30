package com.github.gkttk.fourth.arraywrapper.logic.sorting;

import com.github.gkttk.fourth.arraywrapper.model.ArrayWrapper;

/**
 * This class represents an sorter, which bubble-sorts internal array of given arrayWrapper.
 */
public class BubbleArraySorter implements ArraySorter {
    @Override
    public void sortArray(ArrayWrapper arrayWrapper) {
        int size = arrayWrapper.getSize();
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayWrapper.getElementByIndex(j) > arrayWrapper.getElementByIndex(j + 1)) {
                    swapElements(arrayWrapper, j, j + 1);
                }
            }
        }


    }

    /**
     * Method for swap two elements internal array of given arrayWrapper between each other.
     *
     * @param arrayWrapper wrapper which stores an sorting array.
     * @param index1       index of first element.
     * @param index2       index of second element.
     */
    private void swapElements(ArrayWrapper arrayWrapper, int index1, int index2) {
        int firstElem = arrayWrapper.getElementByIndex(index1);
        int secondElem = arrayWrapper.getElementByIndex(index2);

        arrayWrapper.setElement(firstElem, index2);
        arrayWrapper.setElement(secondElem, index1);

    }
}
