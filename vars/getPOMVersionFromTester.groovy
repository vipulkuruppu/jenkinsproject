#!/usr/bin/groovy
import uob.shared.pom.*
def call(String branchType, String pomFile) {

    def pt = new uob.shared.pom.POMTester()
    def version = pt.readVersion('Core', 'pom.xml')
    echo 'Using version ' +  pomConfig.branchtype + ' ' + pomConfig.pomfile + ' ' + version
    return version
}
