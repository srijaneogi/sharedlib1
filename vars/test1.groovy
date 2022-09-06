def call(name){
    pipeline {
        agent any
        def mvnHome
        def creds = 'gitnewusethis'
        def sharedlib = 'https://github.com/srijaneogi/sharedlib1.git'
        def no = 1
        try {
        stage('Preparation') {
            when {
                expression {
                    env.BRANCH_NAME == 'dev' || env.BRANCH_NAME == 'qat'
                }
            }
//             dir('thisdir') {
                echo "${name} hello from shared lib 1"
                git credentialsId: creds, url: sharedlib, branch: 'master'
//             }
            echo "2222222222 ${name} hello from shared lib 1"
        }
        stage('validation') { 
            echo "${name} hello from shared lib 1 stage 2"
            if ( no == 1) {
                error "Need to abort this build"
                sleep 5
            }
        }
        stage('conclusion') { 
            echo "${name} hello from shared lib 1 stage 3"
        }
        } catch(e) {
            echo "This will run only if failed"
            currentBuild.result = 'FAILURE'
        
        }
    }
}
