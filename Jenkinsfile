pipeline{
	agent{
		docker {
			image 'python:latest'
			args '-u root'
		}
	}
	environment {
		now = sh(returnStdout: true,script: "date '+%Y%m%d' ")
	}
	stages{
	   stage('Dev'){
	   		steps{
	   			sh'''
	   			apt-get update
	   			apt-get -y install python3
	   			apt-get install pip -y
	   			python3 --version
	   			echo "The time is :$now"
	   			'''
	   		}
		post{
		always {
			junit 'report.xml'
		}
	   }
	}
   }
}
