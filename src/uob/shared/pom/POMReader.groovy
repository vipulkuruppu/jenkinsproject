package uob.shared.pom

class POMReader implements Serializable {

    static def readVersion(String branchType, String pomfile){

        String version = sh( script: 'date +%d%m%Y.%H%M%S', returnStdout: true).toString().trim()
        echo 'Using version ' +  branchtype + ' ' + pomfile + ' ' + version
        return version
    }

}