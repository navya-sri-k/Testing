pipeline {
    agent any // This defines the Jenkins agent to run the pipeline

    environment {
        // You can define environment variables here
        MY_ENV_VAR = 'example_value'
    }

        stage('Build') {
            steps {
                // Example build step
                echo "Building the application..."
                sh 'echo "Building..."'
                // You could add commands to build, e.g., for Java: sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Example testing step
                echo "Running tests..."
                sh 'echo "Running tests..."'
                // For Java projects, you might run something like: sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Example deployment step
                echo "Deploying application..."
                // Add your deployment commands, e.g., SSH to a server or push to a container registry
            }
        }
    }

    post {
        success {
            echo 'The pipeline was successful!'
        }
        failure {
            echo 'The pipeline failed.'
        }
        always {
            echo 'Cleaning up after the pipeline run.'
            // Clean-up steps, like deleting temporary files, can go here
        }
    }
}
