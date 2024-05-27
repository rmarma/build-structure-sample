plugins {
    `java-library`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    compileOnlyApi(project(":sources:library03:api"))
    compileOnlyApi(project(":sources:library04:api"))
    compileOnlyApi(project(":sources:library05:api"))
}
