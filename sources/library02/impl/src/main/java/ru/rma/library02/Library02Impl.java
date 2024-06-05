package ru.rma.library02;

public class Library02Impl implements Library02 {

    private final Library02Mediator library02Mediator;

    public Library02Impl(Library02Mediator library02Mediator) {
        this.library02Mediator = library02Mediator;
    }

    @Override
    public String name02() {
        return name02(library02Mediator);
    }

    @Override
    public String name02(Library02Mediator library02Mediator) {
        return "Library02Impl: " + library02Mediator.name03() + ": " + library02Mediator.name04() + ": " + library02Mediator.name05();
    }
}
