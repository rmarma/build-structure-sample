package ru.rma.app;

import ru.rma.library01.Library01;
import ru.rma.library01.Library01Impl;
import ru.rma.library01.Library01Mediator;
import ru.rma.library01.Library01MediatorImpl;
import ru.rma.library02.Library02;
import ru.rma.library02.Library02Impl;
import ru.rma.library02.Library02Mediator;
import ru.rma.library02.Library02MediatorImpl;
import ru.rma.library03.Library03;
import ru.rma.library03.Library03Impl;
import ru.rma.library03.Library03Mediator;
import ru.rma.library03.Library03MediatorImpl;
import ru.rma.library04.Library04;
import ru.rma.library04.Library04Impl;
import ru.rma.library04.Library04Mediator;
import ru.rma.library04.Library04MediatorImpl;
import ru.rma.library05.Library05;
import ru.rma.library05.Library05Impl;

public class App {

    public static void main(String[] args) {
        final Library05 library05 = new Library05Impl();
        final Library04Mediator library04Mediator = new Library04MediatorImpl(library05);
        final Library04 library04 = new Library04Impl(library04Mediator);
        final Library03Mediator library03Mediator = new Library03MediatorImpl(library04, library05);
        final Library03 library03 = new Library03Impl(library03Mediator);
        final Library02Mediator library02Mediator = new Library02MediatorImpl(library03, library04, library05);
        final Library02 library02 = new Library02Impl(library02Mediator);
        final Library01Mediator library01Mediator = new Library01MediatorImpl(library02, library03, library04, library05);
        final Library01 library01 = new Library01Impl(library01Mediator);
        System.out.println(library01.name01());
    }
}
