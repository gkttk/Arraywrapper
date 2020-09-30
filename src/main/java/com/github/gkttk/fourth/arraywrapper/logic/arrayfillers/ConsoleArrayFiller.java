package com.github.gkttk.fourth.arraywrapper.logic.arrayfillers;

import com.github.gkttk.fourth.arraywrapper.model.ArrayWrapper;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * This class represents an filler of array, which fills internal array of given arrayWrapper with console data.
 */
public class ConsoleArrayFiller implements ArrayFiller {

    @Override
    public void fillArray(ArrayWrapper arrayWrapper) {
        int arraySize = arrayWrapper.getSize();
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < arraySize; i++) {
                System.out.print("Enter a number: ");
                try {
                    int number = scanner.nextInt();
                    arrayWrapper.setElement(number, i);
                } catch (InputMismatchException exception) {
                    System.out.println("You have entered not a number, plz try again");
                    scanner.nextLine();
                    i--;
                }
            }
        }


    }
}
