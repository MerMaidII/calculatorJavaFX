plugins {
    id("java")
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
    id("org.beryx.jlink") version "2.26.0"
}

group = "com.application"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

javafx {
    version = "21.0.2"
    modules = listOf("javafx.controls", "javafx.fxml",  "javafx.web")
}

application {
    mainClass.set("com.app.Main")
    mainModule.set("com.app")
}

jlink {
    launcher {
        name = "Main"
    }
}

tasks.test {
    useJUnitPlatform()
}
