#include <android/log.h>
#include <jni.h>
#include <string.h>
#include <foo/foo.h>

JNIEXPORT void JNICALL
Java_md_aora_prefab_lib_use_prefab_NativeLib_logInJNI(JNIEnv *env, jobject thiz) {
    __android_log_print(ANDROID_LOG_INFO, "lib-use-prefab", "value from foo: %d", value_from_foo());
}