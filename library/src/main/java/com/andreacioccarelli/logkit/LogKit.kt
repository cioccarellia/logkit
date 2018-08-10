package com.andreacioccarelli.logkit

import android.annotation.SuppressLint
import android.util.Log

@SuppressLint("LogConditional")
fun logd(vararg items: Any) {
    for (item in items) {
        Log.d("$LOGGING_TAG $DEBUG_TAG", item.toString())
    }
}

@SuppressLint("LogConditional")
fun loge(vararg items: Any) {
    for (item in items) {
        Log.e("$LOGGING_TAG $ERROR_TAG", item.toString())
    }
}

@SuppressLint("LogConditional")
fun logw(vararg items: Any) {
    for (item in items) {
        Log.w("$LOGGING_TAG $WARNING_TAG", item.toString())
    }
}

@SuppressLint("LogConditional")
fun logi(vararg items: Any) {
    for (item in items) {
        Log.i("$LOGGING_TAG $INFO_TAG", item.toString())
    }
}

@SuppressLint("LogConditional")
fun loga(vararg items: Any) {
    for (item in items) {
        Log.wtf("$LOGGING_TAG $ASSERT_TAG", item.toString())
    }
}