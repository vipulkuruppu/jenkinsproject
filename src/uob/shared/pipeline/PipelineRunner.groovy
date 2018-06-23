#!/usr/bin/env groovy
package uob.shared.pipeline

class PipelineRunner {
   static String foo = "bar"

   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
}