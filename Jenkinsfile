pipeline{
  agent{
	docker {
		image 'ubuntu:latest'
		args '-u root'
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
