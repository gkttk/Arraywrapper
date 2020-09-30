package com.github.gkttk.fourth.arraywrapper.logic.arrayfilters;

import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.ArrayFiller;
import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.ConsoleArrayFiller;
import com.github.gkttk.fourth.arraywrapper.model.ArrayWrapper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ConsoleArrayWrapperFillerTest {

    private static InputStream defaultIn = System.in;
    private static ByteArrayInputStream newIn;
    private static ArrayFiller consoleArrayFiller;

    @BeforeAll
    static void init() {
        newIn = new ByteArrayInputStream("5\n4\n3\n2\n1".getBytes());
        consoleArrayFiller = new ConsoleArrayFiller();
        System.setIn(newIn);
    }

    @Test
    public void testFillArrayShouldFillArrayFromConsole() {
        //given
        ArrayWrapper arrayWrapper = new ArrayWrapper(5);
        ArrayWrapper expectedArrayWrapper = new ArrayWrapper(new int[]{5, 4, 3, 2, 1});
        //when
        consoleArrayFiller.fillArray(arrayWrapper);
        //then
        Assertions.assertEquals(expectedArrayWrapper, arrayWrapper);
    }

    @AfterAll
    static void destroy() {
        System.setIn(defaultIn);
    }

}
