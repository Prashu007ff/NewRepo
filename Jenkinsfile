pipeline {
    agent any
    environment{
        JAVA_HOME= 'C:\\Program Files\\Java\\jdk-21'
        PATH="${JAVA_HOME}\\bin;${env.PATH}"
    }
    stages{
        stage('checkout'){
            steps{
                git branch: 'main' url:'https://github.com/Prashu007ff/NewRepo.git'
            }
        }
        stage('compile'){
            steps{
                bat 'javac SimpleOtpService.java'
            }
        }
        stage('run'){
            steps{
                bat 'java SimpleOtpService.java'
            }
        }
    }
}