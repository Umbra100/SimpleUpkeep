/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.8/userguide/building_java_projects.html in the Gradle documentation.
 */

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

val paper_version = project.findProperty("minecraft.version") as String

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    id("com.github.johnrengelman.shadow") version "8.0.0"
    id("java")
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    // This dependency is used by the application.
    implementation(libs.guava)
    compileOnly("io.papermc.paper:paper-api:$paper_version-R0.1-SNAPSHOT")

    implementation(project(":app"))
}


// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(project.findProperty("java_version") as String)
    }
}

application {
   mainClass = "umbra.paperbase.PluginMain"
}

tasks {
   named<ShadowJar>("shadowJar") {
      archiveFileName.set("SimpleUpkeep.jar")
      mergeServiceFiles()
      manifest {
         attributes(mapOf("Main-Class" to "umbra.paperbase.PluginMain"))
      }
   }
}

tasks {
   build {
      dependsOn(shadowJar)
   }
}


