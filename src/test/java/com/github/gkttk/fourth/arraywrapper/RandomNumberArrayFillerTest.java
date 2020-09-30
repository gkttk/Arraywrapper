package com.github.gkttk.fourth.arraywrapper;

import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.ArrayFiller;
import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.RandomNumberArrayFiller;
import com.github.gkttk.fourth.arraywrapper.model.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomNumberArrayFillerTest {

    //I do not use a factory here for creating a RandomNumberArrayFiller with default upper bound
    private ArrayFiller randomNumberArrayFiller = new RandomNumberArrayFiller(10);

    @Test
    public void testFillArrayShouldFillArrayFromFile() {
        //given
        Array array = new Array(new int[]{-1, -1, -1});
        int arraySize = array.getSize();
        //when
        randomNumberArrayFiller.fillArray(array);
        //then
        Assertions.assertAll(() -> {
            for (int i = 0; i < arraySize; i++) {
                int currentElement = array.getElementByIndex(i);
                Assertions.assertNotEquals(-1, currentElement);
            }
        });
    }

}
