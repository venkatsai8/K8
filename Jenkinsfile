pipeline{
   agent{
     docker {
              image 'ubuntu:latest'
	          args '-u root'
            }
       }
    stages{
       stage('File'){
    	   steps{
    		   sh '''
    		     dir("/var/lib/jenkins/jobs/${JOB_NAME}/branches/${BRANCH_NAME}/builds/${BUILD_NUMBER}/")
    		     pwd
    		     echo readFile(file: "log", encoding: "Base64")
    		   '''
    		}
    	}
    }	
}
