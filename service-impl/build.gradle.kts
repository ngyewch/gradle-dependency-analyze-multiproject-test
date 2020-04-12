plugins {
    `java-library`
    id("ca.cutterslade.analyze")
}

dependencies {
    implementation(project(":service-api"))
    implementation("commons-codec:commons-codec:1.14")
}
