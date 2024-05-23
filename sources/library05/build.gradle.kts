plugins {
    `java-library`
}

group = "ru.rma"
version = "1.0.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
