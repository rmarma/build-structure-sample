package ru.rma.library04;

public class Library04Impl implements Library04 {

    private final Library04Mediator library04Mediator;

    public Library04Impl(Library04Mediator library04Mediator) {
        this.library04Mediator = library04Mediator;
    }

    @Override
    public String name04() {
        return name04(library04Mediator);
    }

    @Override
    public String name04(Library04Mediator library04Mediator) {
        return "Library04Impl: " + library04Mediator.name05();
    }
}
