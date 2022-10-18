pipeline{
  agent{
	docker {
		image 'blissful_benzwq'
		args '-u root'
		}
	}
  stages{
     steps{
	sh '''
	   apt-get update
	   apt-get install python
	   '''

	  }
       }
}
