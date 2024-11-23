pipeline {
    agent any
    environment {
        DOCKERHUB_CREDENTIALS = credentials('dockerhub')
    }
    stages {
        stage('Build Docker Image') {
            steps {
                // Clean up any existing Docker images if necessary
                sh 'docker rmi -f dineshindupuri/sweassignment03:latest || true'

                // Build the Docker image using the Dockerfile
                sh 'docker build --no-cache -t dineshindupuri/sweassignment03:latest .'
            }
        }

        stage('Docker Login') {
            steps {
                // Log in to Docker Hub
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
        }

        stage('Push Image to Docker Hub') {
            steps {
                // Push the built image to Docker Hub
                sh 'docker push dineshindupuri/sweassignment03:latest'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                // Update the Kubernetes deployment to use the new image
                sh 'kubectl set image deployment/springboot-deployment container-0=dineshindupuri/sweassignment03:latest -n default'

                // Restart the Kubernetes deployment to apply the new image
                sh 'kubectl rollout restart deployment/springboot-deployment -n default'
            }
        }
    }

    post {
        always {
            // Ensure Docker logout happens after each run
            sh 'docker logout'
        }
    }
}
