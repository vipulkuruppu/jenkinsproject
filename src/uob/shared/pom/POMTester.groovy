package uob.shared.pom
import uob.shared.common.Constants
def readVersion(String branchType, String pomFile){

    String version = 'date +%d%m%Y.%H%M%S'.execute().text
    println 'Using version ' +  branchType + ' ' + pomFile + ' ' + version
    println 'BB Home - ${WORKSPACE}/' + Constants.BIT_BUCKET_HOME
    sh "echo WORKSPACE - ${WORKSPACE}"
    sh "echo New Sources - ${WORKSPACE}/${Constants.NEW_SOURCE_HOME}"
    return version
}
