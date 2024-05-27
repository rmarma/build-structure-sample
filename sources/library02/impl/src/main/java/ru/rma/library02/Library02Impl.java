package ru.rma.library02;

import ru.rma.library03.Library03;
import ru.rma.library04.Library04;
import ru.rma.library05.Library05;

public class Library02Impl implements Library02 {

    private final Library03 library03;

    private final Library04 library04;

    private final Library05 library05;

    public Library02Impl(Library03 library03, Library04 library04, Library05 library05) {
        this.library03 = library03;
        this.library04 = library04;
        this.library05 = library05;
    }

    @Override
    public String name02() {
        return name02(library03, library04, library05);
    }

    @Override
    public String name02(Library03 library03, Library04 library04, Library05 library05) {
        return "Library02Impl: " + library03.name03() + ": " + library04.name04() + ": " + library05.name05();
    }
}
