package org.after90.hellolibrary

class HelloLibrary {
    external fun stringFromJNI(): String

    companion object {
        init {
            System.loadLibrary("main")
        }
    }
}
