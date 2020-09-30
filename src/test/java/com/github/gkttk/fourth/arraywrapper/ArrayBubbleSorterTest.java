package com.github.gkttk.fourth.arraywrapper;

import com.github.gkttk.fourth.arraywrapper.logic.sorting.ArraySorter;
import com.github.gkttk.fourth.arraywrapper.logic.sorting.BubbleArraySorter;
import com.github.gkttk.fourth.arraywrapper.model.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayBubbleSorterTest {

    private final ArraySorter bubbleArraySorter = new BubbleArraySorter();

    @Test
    public void testSortArrayShouldSortArray() {
        //given
        int[] testInternalArray = {5, 4, 3, 2, 1};
        int[] expectedInternalArray = {1, 2, 3, 4, 5};
        Array arrayWrapper = new Array(testInternalArray);
        Array expectedArrayWrapper = new Array(expectedInternalArray);
        //when
        bubbleArraySorter.sortArray(arrayWrapper);
        //then
        Assertions.assertEquals(expectedArrayWrapper, arrayWrapper);

    }

}
