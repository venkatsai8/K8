pipeline{
   agent{
     docker {
              image 'ubuntu:latest'
	      args '-u root'
            }
       }
   environment {
		now = sh(returnStdout: true,script: "date '+%Y%m%d' ")
               }
   stages{
      stage('Dev'){
        steps{
           sh '''
	   	apt-get update
	   	apt-get -y install python3
	   	apt-get install pip -y
	   	echo "Python version is " python3 --version
	   	echo "The time is :$now"
	   	echo "Pip version is " pip --version 
	   	pip install pandas 
	   	echo "The username is "${username}
	   	echo "The password is "${password}
	   '''
	    }
	   }
	stage('File'){
	   steps{
		   sh '''
		     pwd
		     dir("/var/lib/jenkins/jobs/${JOB_NAME}/branches/${BRANCH_NAME}/builds/${BUILD_NUMBER}/")
		     pwd
		     echo readFile(file: "log", encoding: "Base64")
		   '''
		}
	}
	   
   }	  
}
