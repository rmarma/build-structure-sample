rootProject.name = "build-structure-sample"

include(
    ":application",
    ":sources:library01:api",
    ":sources:library01:impl",
    ":sources:library02:api",
    ":sources:library02:impl",
    ":sources:library03:api",
    ":sources:library03:impl",
    ":sources:library04:api",
    ":sources:library04:impl",
    ":sources:library05:api",
    ":sources:library05:impl",
)
