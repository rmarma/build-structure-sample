plugins {
    application
}

group = "ru.rma"
version = "1.0.0"

application {
    mainClass = "ru.rma.app.App"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    implementation(project(":sources:library01"))
    implementation(project(":sources:library02"))
    implementation(project(":sources:library03"))
    implementation(project(":sources:library04"))
    implementation(project(":sources:library05"))
}
