#!/usr/bin/groovy
def hello(message) {
    echo "Hello " + message + "..."
}

def bye(message) {
    echo "Bye " + message + "..."
}

def hellofromsh(message1, message2){
    def shell_script = libraryResource 'shell/hello.sh'
    sh "bash -c '${shell_script}' ${message1} ${message2}"
}
