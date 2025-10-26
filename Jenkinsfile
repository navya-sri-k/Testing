pipeline {
    agent any

    environment {
        BRANCH_NAME = 'main'  // Set the branch to 'main'
    }
    
    tools {
        maven 'Maven 3.6.3' // This name must match the Maven installation name in Jenkins
    }
    
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out the code...'
                checkout scm  // Checkout the code from the repository
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
                echo 'Running build...'
                sh 'echo "Building project..."'  // Placeholder for your actual build command
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed.'  // Always runs after the pipeline ends
        }
    }
}
