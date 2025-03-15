package md.aora.prefab.debug

import android.app.Activity
import android.os.Bundle
import md.aora.prefab.lib.use.prefab.NativeLib

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NativeLib().logInJNI()
    }
}