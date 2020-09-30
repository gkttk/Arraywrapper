package com.github.gkttk.fourth.arraywrapper;

import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.ArrayFiller;
import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.FileArrayFiller;
import com.github.gkttk.fourth.arraywrapper.model.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileArrayFillerTest {


    private ArrayFiller fileArrayFiller = new FileArrayFiller("src/test/resources/testNumbersForArray.txt");

    @Test
    public void testFillArrayShouldFillArrayFromFile() {
        //given
        Array array = new Array(3);
        Array expectedArray = new Array(new int[]{16, 395, 6});
        //when
        fileArrayFiller.fillArray(array);
        //then
        Assertions.assertEquals(expectedArray, array);
    }


}
