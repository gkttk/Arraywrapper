package com.github.gkttk.fourth.arraywrapper.view;


import com.github.gkttk.fourth.arraywrapper.model.Array;

import java.util.List;

/**
 * Common interface result printers.
 */
public interface ResultPrinter {

    void print(Array arrayWrapper, List<Integer> primeNumbers);

}
