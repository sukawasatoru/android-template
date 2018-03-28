package jp.tinyport.gradle.versioning

import org.gradle.api.Project
import org.gradle.api.provider.Property

class VersioningPluginExtension {
    final Property<AppVersion> appVersion

    VersioningPluginExtension(Project project) {
        appVersion = new AppVersionProvider(project)
    }
}
