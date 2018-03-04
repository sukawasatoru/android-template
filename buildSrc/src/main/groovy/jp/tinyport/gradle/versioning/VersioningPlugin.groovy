package jp.tinyport.gradle.versioning

import org.gradle.api.Plugin
import org.gradle.api.Project

class VersioningPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('setVersion', type: SetAppVersionTask)
        project.task('showVersion', type: ShowVersionTask)
        project.task('bumpMajor', type: BumpMajorTask)
        project.task('bumpBranch', type: BumpBranchTask)
        project.task('bumpMinor', type: BumpMinorTask)
        project.task('bumpRevision', type: BumpRevisionTask)
    }
}
