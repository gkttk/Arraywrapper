package com.github.gkttk.fourth.arraywrapper.view.factory;


import com.github.gkttk.fourth.arraywrapper.view.ConsoleResultPrinter;
import com.github.gkttk.fourth.arraywrapper.view.ResultPrinter;

/**
 * This factory creates ConsoleResultPrinter.
 */
public class ConsoleResultPrinterFactory implements ResultPrinterFactory {

    @Override
    public ResultPrinter createPrinter() {
        return new ConsoleResultPrinter();
    }
}
