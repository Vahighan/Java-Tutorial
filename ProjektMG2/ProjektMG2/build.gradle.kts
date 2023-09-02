plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("org.jsoup:jsoup:1.16.1")
    implementation ("org.apache.logging.log4j:log4j-api:2.20.0")
    implementation ("org.apache.logging.log4j:log4j-core:2.20.0")
}

tasks.test {
    useJUnitPlatform()
}