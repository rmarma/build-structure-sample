package ru.rma.app;

import ru.rma.library01.Library01;
import ru.rma.library01.Library01Impl;
import ru.rma.library02.Library02;
import ru.rma.library02.Library02Impl;
import ru.rma.library03.Library03;
import ru.rma.library03.Library03Impl;
import ru.rma.library04.Library04;
import ru.rma.library04.Library04Impl;
import ru.rma.library05.Library05;
import ru.rma.library05.Library05Impl;

public class App {

    public static void main(String[] args) {
        final Library05 library05 = new Library05Impl();
        final Library04 library04 = new Library04Impl(library05);
        final Library03 library03 = new Library03Impl(library04, library05);
        final Library02 library02 = new Library02Impl(library03, library04, library05);
        final Library01 library01 = new Library01Impl(library02, library03, library04, library05);
        System.out.println(library01.name01());
    }
}
