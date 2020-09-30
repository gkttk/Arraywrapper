package com.github.gkttk.fourth.arraywrapper.logic.sorting;

import com.github.gkttk.fourth.arraywrapper.model.ArrayWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayWrapperBubbleSorterTest {

    private final ArraySorter bubbleArraySorter = new BubbleArraySorter();

    @Test
    public void testSortArrayShouldSortArray() {
        //given
        int[] testInternalArray = {5, 4, 3, 2, 1};
        int[] expectedInternalArray = {1, 2, 3, 4, 5};
        ArrayWrapper arrayWrapper = new ArrayWrapper(testInternalArray);
        ArrayWrapper expectedArrayWrapperWrapper = new ArrayWrapper(expectedInternalArray);
        //when
        bubbleArraySorter.sortArray(arrayWrapper);
        //then
        Assertions.assertEquals(expectedArrayWrapperWrapper, arrayWrapper);

    }

}
