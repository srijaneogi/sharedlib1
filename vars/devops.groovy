def call(mapname){
    pipeline {
    	agent any
    	stages {
            stage('Hello') {			
            	steps {
		   script {
			   echo "${env.BRANCH_NAME}"
			echo "${mapname} hello from shared lib 1"
			echo "${mapname["name"]}"
		   }
            	}
            }
    	}
   }
}
