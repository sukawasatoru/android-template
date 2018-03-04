package jp.tinyport.gradle.versioning

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class BumpBranchTask extends DefaultTask {
    @TaskAction
    void bumpBranch() {
        def version = AppVersion.loadAppVersion(project)
        version.branch++
        version.saveAppVersion(project)
    }
}
