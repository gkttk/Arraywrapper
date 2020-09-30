package com.github.gkttk.fourth.arraywrapper;

import com.github.gkttk.fourth.arraywrapper.exception.WrongIndexException;
import com.github.gkttk.fourth.arraywrapper.model.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    @Test
    public void testGetElementByIndexShouldThrowExceptionWhenIndexIsOutOfRange() {
        //given
        Array arrayWrapper = new Array(new int[]{1, 2, 3, 4, 5});
        int wrongIndex = arrayWrapper.getSize();
        //when
        //then
        Assertions.assertThrows(WrongIndexException.class, () -> arrayWrapper.getElementByIndex(wrongIndex));
    }

    @Test
    public void testSetElementShouldThrowExceptionWhenIndexIsOutOfRange() {
        //given
        Array arrayWrapper = new Array(new int[]{1, 2, 3, 4, 5});
        int element = 10;
        int wrongIndex = arrayWrapper.getSize();
        //when
        //then
        Assertions.assertThrows(WrongIndexException.class, () -> arrayWrapper.setElement(element, wrongIndex));
    }
}
