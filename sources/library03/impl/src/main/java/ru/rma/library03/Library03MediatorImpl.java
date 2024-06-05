package ru.rma.library03;

import ru.rma.library04.Library04;
import ru.rma.library05.Library05;

public class Library03MediatorImpl implements Library03Mediator {

    private final Library04 library04;

    private final Library05 library05;

    public Library03MediatorImpl(Library04 library04, Library05 library05) {
        this.library04 = library04;
        this.library05 = library05;
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
