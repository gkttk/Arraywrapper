package com.github.gkttk.fourth.arraywrapper;

import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.ArrayFiller;
import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.factory.ArrayFillerFactory;
import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.factory.ConsoleArrayFillerFactory;
import com.github.gkttk.fourth.arraywrapper.logic.primenumber.PrimeNumberSeeker;
import com.github.gkttk.fourth.arraywrapper.model.ArrayWrapper;
import com.github.gkttk.fourth.arraywrapper.view.ResultPrinter;
import com.github.gkttk.fourth.arraywrapper.view.factory.ConsoleResultPrinterFactory;
import com.github.gkttk.fourth.arraywrapper.view.factory.ResultPrinterFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //creating ArrayWrapper with init capacity of internal array is 15
        ArrayWrapper arrayWrapper = new ArrayWrapper(15);

        //creating ArrayFiller and filling the internal array of array wrapper
        ArrayFillerFactory arrayFillerFactory = new ConsoleArrayFillerFactory();
        ArrayFiller arrayFiller = arrayFillerFactory.createArrayFiller();
        arrayFiller.fillArray(arrayWrapper);

        //creating primeNumberSeeker and looking for prime numbers in internal array of array wrapper
        PrimeNumberSeeker primeNumberSeeker = new PrimeNumberSeeker();
        List<Integer> primeNumbers = primeNumberSeeker.findPrimeNumbers(arrayWrapper);

        //creating resultPrinter and prime numbers output
        ResultPrinterFactory resultPrinterFactory = new ConsoleResultPrinterFactory();
        ResultPrinter resultPrinter = resultPrinterFactory.createPrinter();
        resultPrinter.print(arrayWrapper, primeNumbers);

    }
}
