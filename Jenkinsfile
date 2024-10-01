pipeline {
    agent any  // Sử dụng bất kỳ agent nào có sẵn

    tools {
        ant 'Ant_1.10'  // Đảm bảo phiên bản Ant đã được cài đặt trong Jenkins
    }

    environment {
        // Định nghĩa các biến môi trường nếu cần
        BUILD_DIR = 'build'
        DIST_DIR = 'dist'
    }

    stages {
        // Giai đoạn 1: Kiểm tra mã nguồn từ Git
        stage('Checkout') {
            steps {
                git url: 'https://github.com/your-repo.git', branch: 'main'
            }
        }

        // Giai đoạn 2: Biên dịch mã nguồn bằng Ant
        stage('Build') {
            steps {
                script {
                    // Sử dụng target "jar" trong build.xml để build và đóng gói file JAR
                    ant 'clean jar'
                }
            }
        }

        // Giai đoạn 3: Chạy các bài kiểm tra
        stage('Test') {
            steps {
                script {
                    // Sử dụng target "test" trong build.xml để chạy JUnit test
                    ant 'test'
                }
            }
        }

        // Giai đoạn 4: Đóng gói (Deploy nếu cần)
        stage('Package') {
            steps {
                script {
                    // Tạo artifact từ build, ví dụ JAR file
                    archiveArtifacts artifacts: 'dist/*.jar', allowEmptyArchive: false
                }
            }
        }
    }

    post {
        always {
            // Thu thập báo cáo kiểm tra JUnit sau khi chạy xong
            junit '**/build/test-reports/*.xml'
        }
        success {
            echo 'Build và kiểm tra thành công!'
        }
        failure {
            echo 'Build hoặc kiểm tra thất bại.'
        }
    }
}
