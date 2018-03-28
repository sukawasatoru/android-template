package jp.tinyport.gradle.versioning

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property

abstract class AbstractVersioningTask extends DefaultTask {
    private final Property<AppVersion> mAppVersion

    AbstractVersioningTask() {
        mAppVersion = project.extensions.getByType(VersioningPluginExtension).appVersion
    }

    AppVersion getAppVersion() {
        mAppVersion.get()
    }

    void setAppVersion(AppVersion newAppVersion) {
        mAppVersion.set(newAppVersion)
    }
}
