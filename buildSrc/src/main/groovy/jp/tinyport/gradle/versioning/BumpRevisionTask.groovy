package jp.tinyport.gradle.versioning

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class BumpRevisionTask extends DefaultTask {
    @TaskAction
    void bumpRevision() {
        def version = AppVersion.loadAppVersion(project)
        version.revision++
        version.saveAppVersion(project)
    }
}
