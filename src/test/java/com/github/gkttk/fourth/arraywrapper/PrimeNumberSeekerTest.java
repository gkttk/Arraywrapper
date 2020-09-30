package com.github.gkttk.fourth.arraywrapper;

import com.github.gkttk.fourth.arraywrapper.logic.simplenumber.PrimeNumberSeeker;
import com.github.gkttk.fourth.arraywrapper.model.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PrimeNumberSeekerTest {

    private final PrimeNumberSeeker primeNumberSeeker = new PrimeNumberSeeker();

    @Test
    public void testFinePrimeNumbersShouldReturnThreePrimeNumbersFromArray() {
        //given
        int[] testArray = {1, 2, 3, 4, 5, 6};
        Array arrayWrapper = new Array(testArray);
        List<Integer> expectedPrimeNumbers = Arrays.asList(2, 3, 5);
        //when
        List<Integer> primeNumbersFromArrays = primeNumberSeeker.findPrimeNumbers(arrayWrapper);
        //then
        Assertions.assertEquals(expectedPrimeNumbers, primeNumbersFromArrays);
    }

}
