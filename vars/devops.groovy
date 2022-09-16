def call(mapname){
    pipeline {
    	agent any
	environment {
    		city = mapname.get("city")
	}
    	stages {
            stage('Hello') {			
            	steps {
		   script {
			echo "${env.BRANCH_NAME}"
			echo "${mapname} hello from shared lib 1"
			echo "${mapname["name"]}"
			println(mapname.get("age"))
// 			def city = mapname.get("city")
			echo "CITY:::${city}"
			
			def mark = mapname.get("mark")
			echo "MARK:::${mark}"
			def b = "devops"
					    if ("$b".contains("dev") && ("$mark" == "right" || "$mark" == 'null')) {
					        echo "All good"
					    }
		   }
            	}
            }
    	}
   }
}
