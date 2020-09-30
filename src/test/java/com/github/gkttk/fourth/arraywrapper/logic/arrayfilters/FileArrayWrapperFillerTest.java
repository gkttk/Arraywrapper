package com.github.gkttk.fourth.arraywrapper.logic.arrayfilters;

import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.ArrayFiller;
import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.FileArrayFiller;
import com.github.gkttk.fourth.arraywrapper.model.ArrayWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileArrayWrapperFillerTest {

    private static final String TEST_FILE_LOCATION = "src/test/resources/testNumbersForArray.txt";
    private ArrayFiller fileArrayFiller = new FileArrayFiller(TEST_FILE_LOCATION);

    @Test
    public void testFillArrayShouldFillArrayFromFile() {
        //given
        ArrayWrapper arrayWrapper = new ArrayWrapper(3);
        ArrayWrapper expectedArrayWrapper = new ArrayWrapper(new int[]{16, 395, 6});
        //when
        fileArrayFiller.fillArray(arrayWrapper);
        //then
        Assertions.assertEquals(expectedArrayWrapper, arrayWrapper);
    }


}
