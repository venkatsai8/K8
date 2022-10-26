pipeline{
	agent{
		docker {  
			image '3.12.0al-slim',
			args '-u root' 
		}
	}
	environment {
		username = 'venkatsai8'
		password = 'Natraj@1997'   
	}
    		 
  stages{
    stage('Dev'){
     steps{
	sh '''
	   apt-get update 
	   apt-get install python3 -y
	   '''

	  }
	    post{
		always {
			junit 'report.xml'
		}
	    }	
       }
    }
	
	stage('Test'){
		steps{
			withCredentials([usernameColonPassword(credentialsId: 'b2bc1024-5d8e-462f-9139-b1e63b2e0e7c', 
							       passwordVariable:'password',usernamevariable:'username')])
			{
				sh '''
				 apt-get -y install git
				 git init 
				 git config --global user.name "venkatsai8"
				 git config global user.email "natrajsai7@gmail.com"
				 git clone "https://github.com/venkatsai8/K8.git"
				 git config credential.helper store
				 git config  --global credential.helper store
				 git pull
				'''
			}
		}
	}
}
