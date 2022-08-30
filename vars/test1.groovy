def call(name){
    node {
        def mvnHome
        def creds = 'gitnewusethis'
        def sharedlib = 'https://github.com/srijaneogi/sharedlib1.git'
        def no = 1
        stage('Preparation') { 
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
            }
        }
        stage('conclusion') { 
            echo "${name} hello from shared lib 1"
        }
    }
}
