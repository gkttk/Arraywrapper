package com.github.gkttk.fourth.arraywrapper.logic.sorting.factory;

import com.github.gkttk.fourth.arraywrapper.logic.sorting.ArraySorter;
import com.github.gkttk.fourth.arraywrapper.logic.sorting.BubbleArraySorter;

/**
 * This factory creates BubbleArraySorter.
 */
public class BubbleArraySorterFactory implements ArraySorterFactory {
    @Override
    public ArraySorter createArraySorter() {
        return new BubbleArraySorter();
    }
}
