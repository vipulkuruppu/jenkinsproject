#!/usr/bin/groovy
import uob.shared.pom.*
def call(String branchType, String pomFile) {

    def pt = new uob.shared.pom.POMTester()
    def version = pt.readVersion(branchType, pomFile)
    echo 'Using version ' +  branchType + ' ' + pomFile + ' ' + version
    return version
}
