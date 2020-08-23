object Depends {
    object AndroidX {
        const val constraint = "androidx.constraintlayout:constraintlayout:1.1.3"
    }

    object Kotlin {
        const val version = "1.3.72"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
        const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.20.0"
    }

    object Test {
        const val androidJunit4Ktx = "androidx.test.ext:junit-ktx:1.1.1"
        const val junit = "junit:junit:4.12"
        const val robolectric = "org.robolectric:robolectric:4.3"
        const val testCoreKtx = "androidx.test:core-ktx:1.2.0"
        const val testRunner = "androidx.test:runner:1.2.0"
        const val testRules = "androidx.test:rules:1.2.0"
        const val truth = "com.google.truth:truth:1.0.1"
        const val truthJava8 = "com.google.truth.extensions:truth-java8-extension:1.0.1"
    }
}
