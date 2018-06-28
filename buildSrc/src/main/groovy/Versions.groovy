class Versions {
    static final arch = new Arch()
    static final errorprone = '2.3.1'
    static final dagger = '2.16'
    static final gradle = new Gradle()
    static final glide = '4.7.1'
    static final kotlin = '1.2.50'
    static final leakcanary = '1.5.4'
    static final manifest = new Manifest()
    static final orma = '4.2.5'
    static final rx = new Rx()
    static final support = new Support()

    static class Arch {
        final live = '1.1.1'
    }

    static class Gradle {
        final android = '3.1.3'
        final androidCacheFix = '0.5.1'
        final errorprone = '0.0.14'
    }

    static class Manifest {
        final compileSdk = 28
        final buildTools = '28.0.0'
        final minSdk = 21
        final targetSdk = 28
    }

    static class Rx {
        final java = '2.1.16'
        final android = '2.0.2'
    }

    static class Support {
        final support = '27.1.1'
        final constraint = '1.1.2'
    }
}
