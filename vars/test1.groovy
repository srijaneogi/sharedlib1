def call(name){
    pipeline {
    	agent any

    	stages {
        	stage('Hello') {
			when {
                        	expression {
                            		env.BRANCH_NAME == 'qat' || env.BRANCH_NAME == 'dev'
                        	}
                    	}
            		steps {
				script {
					def b = env.BRANCH_NAME
					echo "$b"
                			echo 'Hello World'
					echo "2222222222 ${name} hello from shared lib 1"
				}
            		}
        	}
    	}
   }

}
