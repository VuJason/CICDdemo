pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                 git 'https://github.com/VuJason/CICDdemo.git'
            }
        }
        stage('Build') {
            steps {
                    sh 'javac -d bin src/com/example/*.java'
            }
        }
        stage('Test') {
            steps {
                sh 'java -cp .;bin;lib/* org.junit.runner.JUnitCore com.example.TestClass'
            }
        }
    }
    post {
        success {
            echo 'Build and test completed successfully!'
        }
        failure {
            echo 'Build or test failed.'
        }
    }
}