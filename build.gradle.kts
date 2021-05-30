plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://maven.minecraftforge.net/") {
        name = "forge"
        metadataSources {
            artifact()
        }
    }
    maven("https://libraries.minecraft.net/") {
        name = "mojang"
    }
}

val main by sourceSets.getting { java.srcDirs("src/main") }
val forge17 by sourceSets.creating { java.srcDirs("src/forge17") }
val forge18 by sourceSets.creating { java.srcDirs("src/forge18") }

val forge17CompileOnly by configurations.getting
val forge18CompileOnly by configurations.getting

dependencies {
    forge17CompileOnly(sourceSets.main.get().output)
    forge18CompileOnly(sourceSets.main.get().output)

    forge17CompileOnly("net.minecraftforge:forge:1.7.10-10.13.4.1614-1.7.10:universal")
    forge17CompileOnly("com.paulscode:soundsystem:20120107")

    forge18CompileOnly("net.minecraftforge:forge:1.8-11.14.4.1577:universal")
    forge18CompileOnly("com.paulscode:soundsystem:20120107")
}

tasks.jar {
    from(forge17.output)
    from(forge18.output)
    from("LICENSE")
    from("resources")
}
