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
    implementation(project(":sources:library01:api"))
    implementation(project(":sources:library02:api"))
    implementation(project(":sources:library03:api"))
    implementation(project(":sources:library04:api"))
    implementation(project(":sources:library05:api"))
    implementation(project(":sources:library01:impl"))
    implementation(project(":sources:library02:impl"))
    implementation(project(":sources:library03:impl"))
    implementation(project(":sources:library04:impl"))
    implementation(project(":sources:library05:impl"))
}
