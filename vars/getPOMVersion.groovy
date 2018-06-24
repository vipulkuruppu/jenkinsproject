#!/usr/bin/groovy
def call(body) {
    // evaluate the body block, and collect configuration into the object
    def pomConfig = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pomConfig
    body()

    def version = sh( script: 'date +%d%m%Y.%H%M%S', returnStdout: true).toString().trim()
    echo 'Using new version ' +  pomConfig.branchtype + ' ' + pomConfig.pomfile + ' ' + version
    return version
}
