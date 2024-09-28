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
                
                sh 'mvn clean package'
            }
        }
	stage('Test') {
            steps {
		sh 'mvn test'
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