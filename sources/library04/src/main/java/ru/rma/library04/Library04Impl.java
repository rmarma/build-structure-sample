package ru.rma.library04;

import ru.rma.library05.Library05;

public class Library04Impl implements Library04 {

    private final Library05 library05;

    public Library04Impl(Library05 library05) {
        this.library05 = library05;
    }

    @Override
    public String name04() {
        return name04(library05);
    }

    @Override
    public String name04(Library05 library05) {
        return "Library04Impl: " + library05.name05();
    }
}
