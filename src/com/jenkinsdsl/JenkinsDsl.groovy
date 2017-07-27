package com.jenkinsdsl

job('Maven Compile DSL') {
    scm {
        git {
            remote {
                url('https://github.com/rrlux/UnitTests.git')
            }

        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        maven {
            goals('-e compile')

        }
    }

}

job('Maven Package DSL') {
    scm {
        git {
            remote {
                url('https://github.com/rrlux/UnitTests.git')
            }

        }
    }
    triggers {
        scm('H/10 * * * *')
    }
    steps {
        maven {
            goals('-e package')

        }
    }

}


job('Maven Test DSL') {
    scm {
        git {
            remote {
                url('https://github.com/rrlux/UnitTests.git')
            }

        }
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        maven {
            goals('-e test')

        }
    }

}
