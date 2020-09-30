package com.github.gkttk.fourth.arraywrapper.logic.arrayfillers;

import com.github.gkttk.fourth.arraywrapper.model.Array;

import java.util.Random;

/**
 * This class represents an filler of array, which fills internal array of given arrayWrapper
 * with random numbers in range of 0 to upperBound field.
 */
public class RandomNumberArrayFiller implements ArrayFiller {

    private final Random randomGenerator;
    private int upperBound;

    public RandomNumberArrayFiller(int upperBound) {
        this.randomGenerator = new Random();
        this.upperBound = upperBound;
    }

    @Override
    public void fillArray(Array arrayWrapper) {
        int arraySize = arrayWrapper.getSize();
        for (int i = 0; i < arraySize; i++) {
            int number = randomGenerator.nextInt(upperBound + 1);
            arrayWrapper.setElement(number, i);
        }
    }

    /**
     * Method for changing upper bound of generated random number.
     *
     * @param newUpperBound new upper bound.
     */
    public void setUpperBound(int newUpperBound) {
        this.upperBound = newUpperBound;
    }
}
