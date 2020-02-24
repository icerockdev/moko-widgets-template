// MOVE:APP_ID

package org.example.app // REPLACE:org.example.app:APP_ID

import android.app.Application
import org.example.mpp.App

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        mppApplication = App().apply { initialize() }
    }

    companion object {
        lateinit var mppApplication: App
    }
}
