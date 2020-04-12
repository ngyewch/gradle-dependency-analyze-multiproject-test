plugins {
    application
    id("ca.cutterslade.analyze")
}

dependencies {
    implementation(project(":service-api"))
    implementation(project(":service-impl"))
}

application {
    mainClassName = "test.Main"
}
