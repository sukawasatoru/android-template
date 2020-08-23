plugins {
    id("com.android.library")
    kotlin("android")
    id("org.gradle.android.cache-fix")
}

dependencies {
    implementation(Depends.Kotlin.stdlib)
    testImplementation(Depends.Test.junit)
    testImplementation(Depends.Test.truth)
    testImplementation(Depends.Test.truthJava8)
}
