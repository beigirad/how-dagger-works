package ir.beigirad.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import ir.beigirad.app.logger.Logger
import javax.inject.Inject

@HiltAndroidApp
class MyApplication : Application() {
    @Inject
    lateinit var logger: Logger

    override fun onCreate() {
        super.onCreate()
        logger.say("onCreate $this")
    }
}