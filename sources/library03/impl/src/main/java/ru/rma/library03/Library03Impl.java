package ru.rma.library03;

public class Library03Impl implements Library03 {

    private final Library03Mediator library03Mediator;

    public Library03Impl(Library03Mediator library03Mediator) {
        this.library03Mediator = library03Mediator;
    }


    @Override
    public String name03() {
        return name03(library03Mediator);
    }

    @Override
    public String name03(Library03Mediator library03Mediator) {
        return "Library03Impl: " + library03Mediator.name04() + ": " + library03Mediator.name05();
    }
}
