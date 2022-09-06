def call(name){
    node {
        def mvnHome
        def no=1
        stage('Preparation') {
            when {
                branch 'master'
            }
            echo "${name} hello from shared lib 1"
        }
        stage('validation') { 
            echo "${name} hello from shared lib 1 stage 2"
            if ( no == 1) {
                error "Need to abort this build"
            }
        }
        stage('conclusion') { 
            echo "${name} hello from shared lib 1"
        }
    }
}
