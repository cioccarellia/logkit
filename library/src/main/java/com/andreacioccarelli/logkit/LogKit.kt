package com.andreacioccarelli.logkit

import android.annotation.SuppressLint
import android.support.annotation.NonNull
import android.util.Log
import org.jetbrains.annotations.Nullable

/**
 * Debug log call.
 *
 * Should be used in the most of the cases to print a debug message
 * The color for this call is Green [#66BB6A]
 * */
@SuppressLint("LogConditional")
fun logd(@Nullable vararg items: Any?) {
    for (item in items) {
        Log.d("$LOGGING_TAG $DEBUG_TAG", item.toString())
    }
}

/**
 * Direct debug code logger 
 */
@SuppressLint("LogConditional")
fun logd(@NonNull code: () -> Any?) = Log.d("$LOGGING_TAG $DEBUG_TAG", code().toString())

/**
 * Error log call.
 *
 * Should be used to log errors or exceptions
 * The color for this call is Red [#EF5350]
 * */
@SuppressLint("LogConditional")
fun loge(@Nullable vararg items: Any?) {
    for (item in items) {
        Log.e("$LOGGING_TAG $ERROR_TAG", item.toString())
    }
}

/**
 * Exception caller log call.
 *
 * Should be used to log data before crashing.
 * */
@SuppressLint("LogConditional")
fun logX(@Nullable vararg items: Any?) {
    for (item in items) {
        Log.e("$LOGGING_TAG $EXCEPTION_TAG", item.toString())
    }
    throw RuntimeException()
}

/**
 * Direct error code logger 
 */
@SuppressLint("LogConditional")
fun loge(@NonNull code: () -> Any?) = Log.e("$LOGGING_TAG $ERROR_TAG", code().toString())

/**
 * Warning log call.
 *
 * Should be used to print warnings and non-critical errors
 * The color for this call is Yellow [#FFA726]
 * */
@SuppressLint("LogConditional")
fun logw(@Nullable vararg items: Any?) {
    for (item in items) {
        Log.w("$LOGGING_TAG $WARNING_TAG", item.toString())
    }
}

/**
 * Direct warning code logger 
 */
@SuppressLint("LogConditional")
fun logw(@NonNull code: () -> Any?) = Log.w("$LOGGING_TAG $WARNING_TAG", code().toString())

/**
 * Info log call.
 *
 * Should be used to print information or data about
 * the current program execution algorithm state
 * The color for this call is Blue [#00B0FF]
 * */
@SuppressLint("LogConditional")
fun logi(@Nullable vararg items: Any?) {
    for (item in items) {
        Log.i("$LOGGING_TAG $INFO_TAG", item.toString())
    }
}

/**
 * Direct info code logger 
 */
@SuppressLint("LogConditional")
fun logi(@NonNull code: () -> Any?) = Log.i("$LOGGING_TAG $INFO_TAG", code().toString())

/**
 * Assert log call.
 *
 * Should be used to print assert details
 * The color for this call is Purple [#BA68C8]
 * */
@SuppressLint("LogConditional")
fun loga(@Nullable vararg items: Any?) {
    for (item in items) {
        Log.wtf("$LOGGING_TAG $ASSERT_TAG", item.toString())
    }
}

/**
 * Direct assert code logger 
 */
@SuppressLint("LogConditional")
fun loga(@NonNull code: () -> Any?) = Log.wtf("$LOGGING_TAG $ASSERT_TAG", code().toString())
