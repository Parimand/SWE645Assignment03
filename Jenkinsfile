//Group member details
// Pavan Sai Gopinadh Reddy Arimanda G01478272
// Venkat Dinesh Indupuri  G01464737
// Nemali Sudheer Reddy   G01410008
// Datta Naga Vamseedhar Gunnampalli  G01478792

// This Jenkins pipeline automates the build, push, and deployment process for a Spring Boot application.
// It includes stages to build the application JAR, create a Docker image, push the image to Docker Hub,
// and update the Kubernetes deployment to use the latest image. Docker login/logout is handled securely using Jenkins credentials.

pipeline {
    agent any
    environment {
        DOCKERHUB_CREDENTIALS = credentials('dockerhub')
    }
    stages {
        stage('Build JAR') {
            steps {
                // Clean up any existing JAR files if necessary
                sh 'rm -rf target/*.jar'
                
                // Build the Spring Boot application
                sh './mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
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
