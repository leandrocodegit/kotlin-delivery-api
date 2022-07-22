pipeline {
    agent any
    stages {
        stage('Compile') {
            steps {
                withGradle(){
                    sh './gradlew ${args.join(' ')} -s'
                }
            }
        }
    }
}
