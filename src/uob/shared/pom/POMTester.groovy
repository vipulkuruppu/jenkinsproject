package uob.shared.pom

def readVersion(String branchType, String pomFile){

    String version = 'date +%d%m%Y.%H%M%S'.execute().text
    println 'Using version ' +  branchType + ' ' + pomFile + ' ' + version
    sh "pwd"
    return version
}
