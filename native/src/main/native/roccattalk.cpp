#ifndef WIN32_LEAN_AND_MEAN
#define WIN32_LEAN_AND_MEAN
#endif

#include <Windows.h>
#include <jni.h>

#include "com_tehasdf_roccat_RoccatTalk.h"
#include "ROCCAT_Talk.h"

JNIEXPORT jboolean JNICALL Java_com_tehasdf_roccat_RoccatTalk__1initialize(JNIEnv* jni, jobject obj, jlong ptr) {
  CROCCAT_Talk* t = reinterpret_cast<CROCCAT_Talk*>(ptr);
  return (jboolean) t->init_ryos_talk();
}

JNIEXPORT jboolean JNICALL Java_com_tehasdf_roccat_RoccatTalk__1setSDKMode
  (JNIEnv *, jobject, jlong ptr, jboolean state) {
  CROCCAT_Talk* t = reinterpret_cast<CROCCAT_Talk*>(ptr);
  return (jboolean) t->set_ryos_kb_SDKmode(state);
}

JNIEXPORT void JNICALL Java_com_tehasdf_roccat_RoccatTalk__1disableAllLEDs
  (JNIEnv *, jobject, jlong ptr) {
  CROCCAT_Talk* t = reinterpret_cast<CROCCAT_Talk*>(ptr);
  t->turn_off_all_LEDS();
}

JNIEXPORT void JNICALL Java_com_tehasdf_roccat_RoccatTalk__1enableAllLEDs
  (JNIEnv *, jobject, jlong ptr) {
  CROCCAT_Talk* t = reinterpret_cast<CROCCAT_Talk*>(ptr);
  t->turn_on_all_LEDS();
}

JNIEXPORT void JNICALL Java_com_tehasdf_roccat_RoccatTalk__1enableLED
  (JNIEnv *, jobject, jlong ptr, jbyte pos) {
  CROCCAT_Talk* t = reinterpret_cast<CROCCAT_Talk*>(ptr);
  t->set_LED_on(pos);
}

JNIEXPORT void JNICALL Java_com_tehasdf_roccat_RoccatTalk__1disableLED
  (JNIEnv *, jobject, jlong ptr, jbyte pos) {
  CROCCAT_Talk* t = reinterpret_cast<CROCCAT_Talk*>(ptr);
  t->set_LED_off(pos);
}

JNIEXPORT void JNICALL Java_com_tehasdf_roccat_RoccatTalk__1setAllLEDs
  (JNIEnv * env, jobject, jlong ptr, jbyteArray bufObj) {
  CROCCAT_Talk* t = reinterpret_cast<CROCCAT_Talk*>(ptr);
  jbyte* buf = env->GetByteArrayElements(bufObj, NULL);
  t->Set_all_LEDS(reinterpret_cast<BYTE*>(buf));
  // TODO: Assert length? Buffer overflow?
  env->ReleaseByteArrayElements(bufObj, buf, JNI_ABORT);
}

JNIEXPORT jlong JNICALL Java_com_tehasdf_roccat_RoccatTalk__1allocateObj
  (JNIEnv *, jobject) {
  return reinterpret_cast<jlong>(new CROCCAT_Talk);
}
