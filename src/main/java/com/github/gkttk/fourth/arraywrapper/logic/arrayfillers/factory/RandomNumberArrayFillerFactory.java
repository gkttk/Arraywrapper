package com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.factory;

import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.ArrayFiller;
import com.github.gkttk.fourth.arraywrapper.logic.arrayfillers.RandomNumberArrayFiller;

/**
 * This factory creates RandomNumberArrayFiller with default upper bound.
 */
public class RandomNumberArrayFillerFactory implements ArrayFillerFactory {
    @Override
    public ArrayFiller createArrayFiller() {
        return new RandomNumberArrayFiller(1000);
    }
}
