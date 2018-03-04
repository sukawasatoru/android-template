package jp.tinyport.gradle.versioning

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class SetAppVersionTask extends DefaultTask {
    @TaskAction
    void setAppVersion() {
        if (!project.hasProperty(AppVersion.KEY_VERSION_NAME)) {
            logger.quiet("""usase
  setVersion -P${AppVersion.KEY_VERSION_NAME}=<(0..125).(A..Z).(0..695).(0..1280)>""")
            return
        }

        def version = new AppVersion(project.property(AppVersion.KEY_VERSION_NAME).toString())
        logger.quiet("version_name=$version")
        version.saveAppVersion(project)
    }
}
