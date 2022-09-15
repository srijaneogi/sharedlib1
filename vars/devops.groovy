def call(mapname){
    pipeline {
    	agent any
    	stages {
            stage('Hello') {			
            	steps {
		   script {
			def b = env.BRANCH_NAME
			echo "$b"
			echo "2222222222 ${mapname} hello from shared lib 1"
			echo "${mapname["name"]}"
		   }
            	}
            }
    	}
   }
}
