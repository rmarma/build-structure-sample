package ru.rma.library01;

import ru.rma.library02.Library02;
import ru.rma.library03.Library03;
import ru.rma.library04.Library04;
import ru.rma.library05.Library05;

public interface Library01 {

    String name01();

    String name01(Library02 library02, Library03 library03, Library04 library04, Library05 library05);
}
