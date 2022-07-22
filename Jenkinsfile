pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                sh 'gradle clean'
            }
        }
        stage('Build') {
                    steps {
                        sh 'gradle build'
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
