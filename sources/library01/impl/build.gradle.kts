plugins {
    `java-library`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    api(project(":sources:library01:api"))
    api(project(":sources:library02:api"))
    api(project(":sources:library03:api"))
    api(project(":sources:library04:api"))
    api(project(":sources:library05:api"))
}
