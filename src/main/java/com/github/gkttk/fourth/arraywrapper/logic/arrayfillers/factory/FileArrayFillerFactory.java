package com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.factory;

import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.ArrayFiller;
import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.FileArrayFiller;

/**
 * This factory creates FileArrayFiller with default file location.
 */
public class FileArrayFillerFactory implements ArrayFillerFactory {
    private final static String DEFAULT_FILE_LOCATION = "numbersForArray.txt";

    @Override
    public ArrayFiller createArrayFiller() {
        return new FileArrayFiller(DEFAULT_FILE_LOCATION);
    }
}
