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
                
                bat 'javac -d bin D:\\demoCICD\\src\\personalincometaxcaculator\\*.java'
            }
        }
	stage('Test') {
            steps {
		bat 'java -cp .;bin;lib/* org.junit.runner.JUnitCore personalincometaxcaculator.TestClass'
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