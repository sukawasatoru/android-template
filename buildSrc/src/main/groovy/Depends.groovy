class Depends {
    static final gradle = new Gradle()
    static final kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$Versions.kotlin"

    static class Gradle {
        final android = "com.android.tools.build:gradle:$Versions.gradle.android"
        final androidCacheFix =
                "gradle.plugin.org.gradle.android:android-cache-fix-gradle-plugin:$Versions.gradle.androidCacheFix"
        final kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$Versions.kotlin"
    }
}
