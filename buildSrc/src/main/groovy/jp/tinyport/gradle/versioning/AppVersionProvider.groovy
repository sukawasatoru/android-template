package jp.tinyport.gradle.versioning

import org.gradle.api.Project
import org.gradle.api.Transformer
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider

class AppVersionProvider implements Property<AppVersion> {
    private final Project project

    private AppVersion appVersion

    AppVersionProvider(Project project) {
        this.project = project
    }

    @Override
    void set(AppVersion appVersion) {
        this.appVersion = appVersion
    }

    @Override
    void set(Provider<? extends AppVersion> provider) {
        appVersion = provider.getOrNull()
    }

    @Override
    AppVersion get() {
        return appVersion ?: AppVersion.loadAppVersion(project)
    }

    @Override
    AppVersion getOrNull() {
        return appVersion
    }

    @Override
    AppVersion getOrElse(AppVersion defaultValue) {
        return appVersion ?: defaultValue
    }

    @Override
    <S> Provider<S> map(Transformer<? extends S, ? super AppVersion> transformer) {
        throw new UnsupportedOperationException()
    }

    @Override
    boolean isPresent() {
        return appVersion != null
    }
}
