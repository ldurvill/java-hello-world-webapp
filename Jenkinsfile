pipeline {
  agent any
  stages {
    stage ('Build') {
      steps {
        sh 'mvn clean package -Dmaven.test.skip' 
      }
    }
    stage ('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage ('Deploy') {
      steps {
        script {
          deploy adapters: [tomcat9(credentialsId: 'eaea93f0-7468-444c-9ef7-16c335052699', path: '', url: 'http://localhost:8080')], contextPath: '/pipeline', onFailure: false, war: 'webapps/*.war' 
        }
      }
    }
  }
}
