package util

import com.cloudbees.groovy.cps.NonCPS

class Logger {
    private static def workflowScript = null

    static void init(def workflowScript) {
        this.workflowScript = workflowScript
    }

    @NonCPS
    static void info(String message) {
        if ( workflowScript ) {
            workflowScript.println("INFO: " + message);
        } else {
            println("INFO: " + message)
        }
    }

    @NonCPS
    static void debug(String message) {
        if ( workflowScript ) {
            workflowScript.println("DEBUG: " + message);
        } else {
            println("DEBUG: " + message)
        }
    }

    @NonCPS
    static void error(String message) {
        if ( workflowScript ) {
            workflowScript.println("ERROR: " + message);
        } else {
            println("ERROR: " + message)
        }
    }

    @NonCPS
    static void warn(String message) {
        if ( workflowScript ) {
            workflowScript.println("WARN: " + message);
        } else {
            println("WARN: " + message)
        }
    }
}
