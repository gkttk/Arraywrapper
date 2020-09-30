package com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.factory;

import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.ArrayFiller;
import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.ConsoleArrayFiller;

/**
 * This factory creates ConsoleArrayFiller.
 */
public class ConsoleArrayFillerFactory implements ArrayFillerFactory {
    @Override
    public ArrayFiller createArrayFiller() {
        return new ConsoleArrayFiller();
    }
}
