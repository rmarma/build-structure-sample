package ru.rma.library03;

import ru.rma.library04.Library04;
import ru.rma.library05.Library05;

public class Library03Impl implements Library03 {

    private final Library04 library04;

    private final Library05 library05;

    public Library03Impl(Library04 library04, Library05 library05) {
        this.library04 = library04;
        this.library05 = library05;
    }


    @Override
    public String name03() {
        return name03(library04, library05);
    }

    @Override
    public String name03(Library04 library04, Library05 library05) {
        return "Library03Impl: " + library04.name04() + ": " + library05.name05();
    }
}
