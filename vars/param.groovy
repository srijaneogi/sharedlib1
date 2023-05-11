def call(l1){
    pipeline {
    	agent any
	    environment {
    		a = l1.get("a")
        b = l1.get("b")
	    }
    	stages {
            stage('Hello') {			
            	steps {
		            script {
			            echo "$a"
                  echo "$b"
                }
              }
            }
      }
    }
}
