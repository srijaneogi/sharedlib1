def call(name){
    node {
    	stage ('nodestage') {
		if (!currentBuild.getBuildCauses('jenkins.branch.BranchEventCause')) {
			currentBuild.result = 'ABORTED'
        		error('Stopping early...')
		}	
	}
    }
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
