def call(mapname){
    pipeline {
    	agent any
	environment {
    	def city = mapname.get("city")
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
		   }
            	}
            }
    	}
   }
}
