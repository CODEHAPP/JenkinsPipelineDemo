pipeline {
    agent any
    environment {
        DIRECTORY_PATH = '/path/to/your/code'
        TESTING_ENVIRONMENT = 'staging'
        PRODUCTION_ENVIRONMENT = 'yourname'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Using Maven to build the code and generate artifacts'
            }
        }
        stage('Unit and Integration Tests') {
            steps {
                echo 'Running unit tests with JUnit and integration tests'
            }
        }
        stage('Code Analysis') {
            steps {
                echo 'Analyzing code quality with SonarQube'
            }
        }
        stage('Security Scan') {
            steps {
                echo 'Performing security scan with OWASP Dependency Check'
            }
        }
        stage('Deploy to Staging') {
            steps {
                echo 'Deploying to staging environment on AWS EC2'
            }
        }
        stage('Integration Tests on Staging') {
            steps {
                echo 'Running integration tests in staging environment'
            }
        }
        stage('Deploy to Production') {
            steps {
                echo "Deploying to production environment: ${env.PRODUCTION_ENVIRONMENT}"
            }
        }
    }
}
