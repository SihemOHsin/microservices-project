pipeline {
    agent any

    stages {
        stage('Pull Docker Images from Docker Hub') {
            steps {
                script {
                    def services = ['config-service', 'eureka-service', 'gateway-service', 'client-service', 'produit-service', 'facture-service']
                    for (service in services) {
                        sh "docker pull sihemohsin/${service}:latest"
                    }
                }
            }
        }

        stage('Deploy with Docker Compose') {
            steps {
                dir('.') { 
                    sh 'docker-compose down'
                    sh 'docker-compose up -d'
                }
            }
        }
    }
}
