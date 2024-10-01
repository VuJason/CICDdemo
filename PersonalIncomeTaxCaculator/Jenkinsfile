pipeline {
    agent any
    tools {
        ant 'Ant_1.10'  
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/VuJason/CICDdemo.git'
            }
        }
        stage('Build') {
            steps {
                ant 'jar'  
            }
        }
        stage('Test') {
            steps {
                ant 'test'  
            }
        }
    }
    post {
        success {
            archiveArtifacts artifacts: '**/dist/*.jar', allowEmptyArchive: true
        }
    }
}
