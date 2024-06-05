package ru.rma.library01;

public class Library01Impl implements Library01 {

    private final Library01Mediator library01Mediator;

    public Library01Impl(Library01Mediator library01Mediator) {
        this.library01Mediator = library01Mediator;
    }

    @Override
    public String name01() {
        return name01(library01Mediator);
    }

    @Override
    public String name01(Library01Mediator library01Mediator) {
        return "Library01Impl: " + library01Mediator.name02() + ": " + library01Mediator.name03() + ": " + library01Mediator.name04() + ": " + library01Mediator.name05();
    }
}
