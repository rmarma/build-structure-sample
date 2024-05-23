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

dependencies {
    implementation(project(":sources:library02"))
    implementation(project(":sources:library03"))
    implementation(project(":sources:library04"))
    implementation(project(":sources:library05"))
}
