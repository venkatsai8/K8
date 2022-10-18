pipeline{
  agent{
	docker {
		image 'blissful_benzwq'
		args '-u root'
		}
	}
  stages{
    stage('Dev'){
     steps{
	sh '''
	   apt-get update
	   apt-get install python
	   '''

	  }
       }
    }
}
