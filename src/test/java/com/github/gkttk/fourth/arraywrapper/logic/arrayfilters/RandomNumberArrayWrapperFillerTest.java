package com.github.gkttk.fourth.arraywrapper.logic.arrayfilters;

import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.ArrayFiller;
import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.RandomNumberArrayFiller;
import com.github.gkttk.fourth.arraywrapper.model.ArrayWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomNumberArrayWrapperFillerTest {


    private static final int DEFAULT_UPPER_BOUND = 10;
    //I do not use a factory here for creating a RandomNumberArrayFiller with default upper bound
    private ArrayFiller randomNumberArrayFiller = new RandomNumberArrayFiller(DEFAULT_UPPER_BOUND);

    @Test
    public void testFillArrayShouldFillArrayFromFile() {
        //given
        ArrayWrapper arrayWrapper = new ArrayWrapper(new int[]{-1, -1, -1});
        int arraySize = arrayWrapper.getSize();
        //when
        randomNumberArrayFiller.fillArray(arrayWrapper);
        //then
        Assertions.assertAll(() -> {
            for (int i = 0; i < arraySize; i++) {
                int currentElement = arrayWrapper.getElementByIndex(i);
                Assertions.assertNotEquals(-1, currentElement);
            }
        });
    }

}
