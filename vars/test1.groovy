def call(name){
    node {
        def mvnHome
        def creds = 'gitnewusethis'
        def sharedlib = 'https://github.com/srijaneogi/sharedlib1.git'
        stage('Preparation') { 
//             dir('thisdir') {
                echo "${name} hello from shared lib 1"
                git credentialsId: creds, url: sharedlib, branch: 'master'
//             }
            echo "2222222222 ${name} hello from shared lib 1"
        }
    }
}
