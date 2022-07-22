pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                gradle 'clean'
            }
        }
        stage('Build') {
                    steps {
                        gradle 'build'
                    }
                }
        stage('Unit Tests') {
            steps {
                gradlew('test')
            }
            post {
                always {
                    junit '**/build/test-results/test/TEST-*.xml'
                }
            }
        }
    }
}
