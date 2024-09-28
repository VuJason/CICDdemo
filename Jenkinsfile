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
                sh 'ant -f build.xml compile' 
            }
        }
        
        stage('Test') {
            steps {
                sh 'ant -f build.xml test' 
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