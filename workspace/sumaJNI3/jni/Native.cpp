#include <jni.h>
#include "com_example_sumajni3_Native.h"

JNIEXPORT jint JNICALL Java_com_example_sumajni3_Native_add
  (JNIEnv * env, jobject obj, jint a, jint b)

{

	return a+b;

};
