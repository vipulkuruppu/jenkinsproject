package uob.shared.pom
//comment

class POMReader implements Serializable {

    static def readVersion(String branchType, String pomFile){

        String version = 'date +%d%m%Y.%H%M%S'.execute().text
        println 'Using version ' +  branchType + ' ' + pomFile + ' ' + version
        return version
    }
}