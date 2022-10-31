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
		   file()
    		   sh '''
    		     echo "The workspace is " ${WORKSPACE}
		     ls -lrt
    		   '''
    		}
    	}
    }	
}
