package com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.factory;

import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.ArrayFiller;
import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.FileArrayFiller;

/**
 * This factory creates FileArrayFiller with default file location.
 */
public class FileArrayFillerFactory implements ArrayFillerFactory {
    @Override
    public ArrayFiller createArrayFiller() {
        return new FileArrayFiller("numbersForArray.txt");
    }
}
