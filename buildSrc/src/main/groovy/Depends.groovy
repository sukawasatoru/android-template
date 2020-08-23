class Depends {
    static final androidx = new AndroidX()
    static final kotlin = new Kotlin()
    static final test = new Test()

    static class AndroidX {
        final constraint = 'androidx.constraintlayout:constraintlayout:1.1.3'
    }

    static class Kotlin {
        final version = '1.3.72'
        final stdlib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
        final serialization = 'org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.20.0'
    }

    static class Test {
        final androidJunit4Ktx = 'androidx.test.ext:junit-ktx:1.1.1'
        final junit = 'junit:junit:4.12'
        final robolectric = 'org.robolectric:robolectric:4.3'
        final testCoreKtx = 'androidx.test:core-ktx:1.2.0'
        final testRunner = 'androidx.test:runner:1.2.0'
        final testRules = 'androidx.test:rules:1.2.0'
        final truth = 'com.google.truth:truth:1.0.1'
        final truthJava8 = 'com.google.truth.extensions:truth-java8-extension:1.0.1'
    }
}