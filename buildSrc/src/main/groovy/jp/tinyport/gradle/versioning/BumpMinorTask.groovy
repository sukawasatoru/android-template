package jp.tinyport.gradle.versioning

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class BumpMinorTask extends DefaultTask {
    @TaskAction
    void bumpMinor() {
        def version = AppVersion.loadAppVersion(project)
        version.minor++
        version.saveAppVersion(project)
    }
}
