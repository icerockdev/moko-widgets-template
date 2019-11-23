/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package org.example.app

import android.app.Application
import org.example.mpp.App

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        mppApplication = App().apply {
            setup()
        }
    }

    companion object {
        lateinit var mppApplication: App
    }
}
