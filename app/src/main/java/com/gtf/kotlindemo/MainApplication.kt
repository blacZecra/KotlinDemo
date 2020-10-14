package com.gtf.kotlindemo

import android.app.Application
import android.util.Log

/**
 * Created by getengfei on 2020-09-29.
 */
class MainApplication : Application() {

    companion object {
        private const val TAG = "MainApplication"
    }

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "onCreate")
    }
}