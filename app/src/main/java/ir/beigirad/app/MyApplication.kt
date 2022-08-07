package ir.beigirad.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import ir.beigirad.app.logger.Logger

@HiltAndroidApp(Application::class)
class MyApplication : Hilt_MyApplication() {
    lateinit var logger: Logger

    override fun onCreate() {
        super.onCreate()
        logger = Logger()
        logger.say("onCreate $this")
    }
}