package uob.shared.pom

//class POMReader implements Serializable {

    def readVersion(String branchType, String pomfile){

        String version = sh( script: 'date +%d%m%Y.%H%M%S', returnStdout: true).toString().trim()
        echo 'Using version ' +  pomConfig.branchtype + ' ' + pomConfig.pomfile + ' ' + version
        return version
    }
//}