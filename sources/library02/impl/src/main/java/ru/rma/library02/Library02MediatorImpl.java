package ru.rma.library02;

import ru.rma.library03.Library03;
import ru.rma.library04.Library04;
import ru.rma.library05.Library05;

public class Library02MediatorImpl implements Library02Mediator {

    private final Library03 library03;

    private final Library04 library04;

    private final Library05 library05;

    public Library02MediatorImpl(Library03 library03, Library04 library04, Library05 library05) {
        this.library03 = library03;
        this.library04 = library04;
        this.library05 = library05;
    }

    @Override
    public String name03() {
        return library03.name03();
    }

    @Override
    public String name04() {
        return library04.name04();
    }

    @Override
    public String name05() {
        return library05.name05();
    }
}
