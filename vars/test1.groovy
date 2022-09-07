def call(name){
    pipeline {
    	agent any

    	stages {
        	stage('Hello') {
            		steps {
                		echo 'Hello World'
				echo "2222222222 ${name} hello from shared lib 1"
            		}
        	}
    	}
   }

}
