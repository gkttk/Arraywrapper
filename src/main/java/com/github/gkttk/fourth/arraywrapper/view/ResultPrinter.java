package com.github.gkttk.fourth.arraywrapper.view;


import com.github.gkttk.fourth.arraywrapper.model.ArrayWrapper;

import java.util.List;

/**
 * Common interface result printers.
 */
public interface ResultPrinter {

    void print(ArrayWrapper arrayWrapper, List<Integer> primeNumbers);

}
