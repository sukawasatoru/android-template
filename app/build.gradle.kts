plugins {
    id("com.android.application")
    kotlin("android")
    id("org.gradle.android.cache-fix")
}

android {
    defaultConfig {
        applicationId = "jp.tinyport.tinyapplication"
        versionCode = 1
        versionName = "0.1.0"
    }
}

dependencies {
    implementation(Depends.Kotlin.stdlib)
}
