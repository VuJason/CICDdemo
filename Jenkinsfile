pipeline {
    agent any  // Sử dụng bất kỳ agent nào của Jenkins để chạy pipeline này
    
    tools {
        ant 'Ant Installation'  // Chỉ định phiên bản Ant (cấu hình trong Jenkins)
        jdk 'JDK18'  // Sử dụng JDK phiên bản 18
    }

    stages {
        stage('Checkout') {
            steps {
                // Lấy mã nguồn từ Git repository
                git url: 'https://github.com/VuJason/CICDdemo.git', branch: 'master'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Biên dịch mã nguồn bằng Ant
                    ant 'clean compile'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Chạy các unit tests bằng JUnit
                    echo "Running test..."
                    ant 'test'
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    // Tạo gói JAR sau khi build thành công
                    ant 'jar'
                }
            }
        }
    }

       

    post {
        always {
            // Thu thập báo cáo kiểm tra JUnit
            junit '**/test-results/*.xml'
        }
        success {
            echo 'Build và kiểm tra thành công!'
        }
        failure {
            echo 'Build hoặc kiểm tra thất bại.'
        }
    }
}
