pipeline{
  agent{
	docker {
		image 'python:3.12.0al-slim'
		args '-u root'
		}
	  environment {
		  now = sh(returnStdout:true,script:"date '+%Y%m%d'"
	  }
	}
  stages{
    stage('Dev'){
     steps{
	sh '''
	   apt-get update 
	   apt-get install python3 -y
	   '''

	  }
       }
    }
}
