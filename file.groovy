#!groovy

def filePath= "/var/lib/jenkins/jobs/Justhj/branches/New/builds/2/log"
def dir = readFile(filePath)
echo $dir
