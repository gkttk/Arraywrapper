package com.github.gkttk.fourth.arraywrapper.view;


import com.github.gkttk.fourth.arraywrapper.model.ArrayWrapper;

import java.util.List;

/**
 * This class represents a console result printer, which print given prime numbers to console.
 */
public class ConsoleResultPrinter implements ResultPrinter {

    @Override
    public void print(ArrayWrapper arrayWrapper, List<Integer> primeNumbers) {
        System.out.print("Array: ");
        System.out.println(arrayWrapper.toString());
        System.out.print("Prime numbers in the array: ");
        for (Integer number : primeNumbers) {
            System.out.print(number + " ");
        }
    }
}
