package com.andreacioccarelli.logkit

import android.annotation.SuppressLint
import android.util.Log

/**
 * Debug log call.
 *
 * Should be used in the most of the cases to print a debug message
 * The color for this call is Green [#66BB6A]
 * */
@SuppressLint("LogConditional")
fun logd(vararg items: Any?) {
    for (item in items) {
        Log.d("$LOGGING_TAG $DEBUG_TAG", item.toString())
    }
}

/**
 * Error log call.
 *
 * Should be used to log errors or exceptions
 * The color for this call is Red [#EF5350]
 * */
@SuppressLint("LogConditional")
fun loge(vararg items: Any?) {
    for (item in items) {
        Log.e("$LOGGING_TAG $ERROR_TAG", item.toString())
    }
}

/**
 * Warning log call.
 *
 * Should be used to print warnings and non-critical errors
 * The color for this call is Yellow [#FFA726]
 * */
@SuppressLint("LogConditional")
fun logw(vararg items: Any?) {
    for (item in items) {
        Log.w("$LOGGING_TAG $WARNING_TAG", item.toString())
    }
}

/**
 * Info log call.
 *
 * Should be used to print information or data about
 * the current program execution algorithm state
 * The color for this call is Blue [#00B0FF]
 * */
@SuppressLint("LogConditional")
fun logi(vararg items: Any?) {
    for (item in items) {
        Log.i("$LOGGING_TAG $INFO_TAG", item.toString())
    }
}

/**
 * Assert log call.
 *
 * Should be used to print assert details
 * The color for this call is Purple [#BA68C8]
 * */
@SuppressLint("LogConditional")
fun loga(vararg items: Any?) {
    assert(true)
    for (item in items) {
        Log.wtf("$LOGGING_TAG $ASSERT_TAG", item.toString())
    }
}