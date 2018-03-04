package jp.tinyport.gradle.versioning

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class BumpMajorTask extends DefaultTask {
    @TaskAction
    void bumpMajor() {
        def version = AppVersion.loadAppVersion(project)
        version.major++
        version.saveAppVersion(project)
    }
}
