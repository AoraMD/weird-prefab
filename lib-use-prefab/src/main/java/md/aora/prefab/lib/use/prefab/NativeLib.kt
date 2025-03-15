package md.aora.prefab.lib.use.prefab

class NativeLib {

    external fun logInJNI()

    companion object {
        init {
            System.loadLibrary("main")
        }
    }
}