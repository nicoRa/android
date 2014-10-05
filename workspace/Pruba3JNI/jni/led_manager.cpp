#include <jni.h>
#include "com_example_pruba3jni_LedManager.h"

JNIEXPORT jint JNICALL Java_com_example_pruba3jni_LedManager_add
  (JNIEnv* env, jobject obj, jint a, jint b)

{

	return a+b;

};
