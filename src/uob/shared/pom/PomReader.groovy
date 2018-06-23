#!/usr/bin/env groovy
package uob.shared.pom

class PomReader {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
}