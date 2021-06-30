pipeline {
    agent any
    tools {
        maven 'mavenGTC'
    }
    stages {
        stage('checkout') {
            steps {
                echo 'checking out...'
                git credentialsId: 'github', url: 'https://github.com/shadabbahadara/notification-service.git'
            }
        }
        stage('build') {
            steps {
                echo 'building...'
                sh "mvn -Dmaven.test.skip package"
            }
        }
    }
    post {
        success {
            echo 'success message...'
        }
        failure {
            echo 'failure message...'
        }
    }
}