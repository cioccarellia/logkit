package com.andreacioccarelli.logkit

import android.annotation.SuppressLint
import android.util.Log
import org.jetbrains.annotations.Nullable

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