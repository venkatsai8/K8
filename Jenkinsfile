pipeline{
   agent{
     docker {
              image 'python:latest'
	          args '-u root'
            }
       }
    stages{
       stage('File'){
    	   steps{
    		   sh '''
    		     echo "The workspace is " ${WORKSPACE}
    		   '''
    		}
    	}
    }	
}
