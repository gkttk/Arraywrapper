package com.github.gkttk.fourth.arraywrapper.logic.primenumber;

import com.github.gkttk.fourth.arraywrapper.model.ArrayWrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * This class seeks prime numbers from internal array of given arrayWrapper.
 */
public class PrimeNumberSeeker {

    public List<Integer> findPrimeNumbers(ArrayWrapper arrayWrapper) {
        List<Integer> primeNumbers = new ArrayList<>();
        int arraySize = arrayWrapper.getSize();
        for (int i = 0; i < arraySize; i++) {
            int currentElement = arrayWrapper.getElementByIndex(i);
            if (isPrimeNumber(currentElement)) {
                primeNumbers.add(currentElement);
            }
        }
        return primeNumbers;
    }

    /**
     * Method  for checking if given number is prime.
     *
     * @param number number for checking.
     * @return true/false depends on is number is prime.
     */
    private boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;


    }

}
