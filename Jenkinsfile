pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Unit and Integration Tests') {
            steps {
                echo 'Running unit and integration tests...'
            }
        }
        stage('Code Analysis') {
            steps {
                echo 'Performing code analysis...'
            }
        }
        stage('Security Scan') {
            steps {
                echo 'Performing security scan...'
            }
        }
        stage('Deploy to Staging') {
            steps {
                echo 'Deploying to staging...'
            }
        }
        stage('Integration Tests on Staging') {
            steps {
                echo 'Running integration tests on staging...'
            }
        }
        stage('Deploy to Production') {
            steps {
                echo 'Deploying to production...'
            }
        }
    }

    post {
        always {
            emailext(
                to: 'job70038@gmail.com',
                subject: "${currentBuild.fullDisplayName} - Build #${env.BUILD_ID} - ${currentBuild.currentResult}",
                body: """<p>Build result: ${currentBuild.currentResult}</p>
                         <p>Build URL: ${env.BUILD_URL}</p>""",
                attachLog: true
            )
        }
    }
}

