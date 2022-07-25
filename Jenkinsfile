pipeline {
    agent any

    stages {
    stage('configure') {
                steps {
                   sh 'gradle wrapper --gradle-version 5.1.1'
                }
            }
        stage('Compile') {
            steps {
                gradlew('clean', 'classes')
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

def gradlew(String... args) {
    sh "./gradlew ${args.join(' ')} -s"
}
