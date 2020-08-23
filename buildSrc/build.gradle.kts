buildscript {
    repositories {
        jcenter()
        mavenCentral()
    }
}

repositories {
    jcenter()
    mavenCentral()
}

plugins {
    `kotlin-dsl`
}

sourceSets {
    main {
        java.srcDirs += file("src/main/kotlin")
    }
}
