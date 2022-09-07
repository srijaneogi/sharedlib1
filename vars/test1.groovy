def call(name){
    pipeline {
    	agent any

    	stages {
        	stage('Hello') {
			when {
                        	expression {
                            		env.BRANCH_NAME == 'dev' || env.BRANCH_NAME == 'master'
                        	}
                    	}
            		steps {
                		echo 'Hello World'
				echo "2222222222 ${name} hello from shared lib 1"
            		}
        	}
    	}
   }

}
