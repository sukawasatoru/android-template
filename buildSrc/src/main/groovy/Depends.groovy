class Depends {
    static final gradle = new Gradle()
    static final kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$Versions.kotlin"
    static final test = new Test()

    static class Gradle {
        final android = "com.android.tools.build:gradle:$Versions.gradle.android"
        final androidCacheFix =
                "gradle.plugin.org.gradle.android:android-cache-fix-gradle-plugin:$Versions.gradle.androidCacheFix"
        final kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$Versions.kotlin"
    }

    static class Test {
        final junit = "junit:junit:4.12"
        final truth = "com.google.truth:truth:1.0.1"
        final truthJava8 = "com.google.truth.extensions:truth-java8-extension:1.0.1"
    }
}
