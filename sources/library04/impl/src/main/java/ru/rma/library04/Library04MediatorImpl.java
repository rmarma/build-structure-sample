package ru.rma.library04;

import ru.rma.library05.Library05;

public class Library04MediatorImpl implements Library04Mediator {

    private final Library05 library05;

    public Library04MediatorImpl(Library05 library05) {
        this.library05 = library05;
    }

    @Override
    public String name05() {
        return library05.name05();
    }
}
