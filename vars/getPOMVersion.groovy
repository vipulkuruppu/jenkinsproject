#!/usr/bin/groovy
def call(Map pomConfig) {

    def version = sh( script: 'date +%d%m%Y.%H%M%S', returnStdout: true).toString().trim()
    echo 'Using version ' +  pomConfig.branchtype + ' ' + pomConfig.pomfile + ' ' + version
    return version
}
