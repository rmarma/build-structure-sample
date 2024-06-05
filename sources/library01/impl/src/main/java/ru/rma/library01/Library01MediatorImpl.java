package ru.rma.library01;

import ru.rma.library02.Library02;
import ru.rma.library03.Library03;
import ru.rma.library04.Library04;
import ru.rma.library05.Library05;

public class Library01MediatorImpl implements Library01Mediator {

    private final Library02 library02;

    private final Library03 library03;

    private final Library04 library04;

    private final Library05 library05;

    public Library01MediatorImpl(Library02 library02, Library03 library03, Library04 library04, Library05 library05) {
        this.library02 = library02;
        this.library03 = library03;
        this.library04 = library04;
        this.library05 = library05;
    }

    @Override
    public String name02() {
        return library02.name02();
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
