pipeline {
    agent {
        label 'android'
    }

    stages {
        stage('Build') {
            steps {
                sh './gradlew --info --profile build'
            }
        }

        stage('Report') {
            steps {
                parallel(
                        "Report": {
                            checkstyle(canComputeNew: true, canResolveRelativePaths: true)
                        },
                        "Artifact": {
                            archiveArtifacts(artifacts: '**/*.apk,**/reports/lint-results*', fingerprint: true)
                        }
                )
            }
        }
    }
}
