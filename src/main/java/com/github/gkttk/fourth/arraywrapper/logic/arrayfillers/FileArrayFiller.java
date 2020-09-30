package com.github.gkttk.fourth.arraywrapper.logic.arrayfillers;

import com.github.gkttk.fourth.arraywrapper.model.ArrayWrapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class represents an filler of array, which fills internal array of given arrayWrapper with data from file.
 */
public class FileArrayFiller implements ArrayFiller {

    private String fileLocation;

    public FileArrayFiller(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    @Override
    public void fillArray(ArrayWrapper arrayWrapper) {
        int arraySize = arrayWrapper.getSize();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation))) {
            String lineOfNumbers = bufferedReader.readLine();
            String[] numbers = lineOfNumbers.split(" ");
            for (int i = 0; i < arraySize; i++) {
                int number = Integer.parseInt(numbers[i]);
                arrayWrapper.setElement(number, i);
            }
        } catch (IOException e) {
            throw new RuntimeException("IOException has occurred", e);
        }
    }

    /**
     * Method for changing file for data reading.
     *
     * @param newFileLocation new file location.
     */
    public void changeFile(String newFileLocation) {
        this.fileLocation = newFileLocation;
    }
}
