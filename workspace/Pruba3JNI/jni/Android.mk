LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := led_manager
LOCAL_SRC_FILES := led_manager.cpp

include $(BUILD_SHARED_LIBRARY)
