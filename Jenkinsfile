pipeline {
    agent any

    environment {
        BRANCH_NAME = 'main'  // Set the branch to 'main'
        MAVEN_HOME = '/usr/bin/mvn'  // Set the Maven installation path (you might need to adjust this depending on your setup)
        MAVEN_VERSION = '3.9.11'         // Set Maven version
        PATH = "${MAVEN_HOME}/bin:${env.PATH}"  // Ensure Maven is on the PATH
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
                echo 'Running build...'
                sh 'echo "Building project..."'  // Placeholder for your actual build command
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed.'  // Always runs after the pipeline ends
        }
    }
}
