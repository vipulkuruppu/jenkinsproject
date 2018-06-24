package uob.shared.pom
import uob.shared.common.Constants
def readVersion(String branchType, String pomFile){

    String version = 'date +%d%m%Y.%H%M%S'.execute().text
    println 'Using version ' +  branchType + ' ' + pomFile + ' ' + version
    println 'BB Home - ' + Constants.BIT_BUCKET_HOME
    sh "echo WORKSPACE - ${WORKSPACE}"
    sh "echo New Sources - ${Constants.NEW_SOURCE_HOME}"
    return version
}
