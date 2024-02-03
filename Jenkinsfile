pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    checkout scm
                }
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t my-demo-app:latest .'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    sh 'docker run -p 3000:3000 my-demo-app:latest'
                }
            }
        }
    }
}