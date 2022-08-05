package ir.beigirad.app

import android.app.Application
import ir.beigirad.app.logger.Logger

class MyApplication : Application() {
    lateinit var logger: Logger

    override fun onCreate() {
        super.onCreate()
        logger = Logger()
        logger.say("onCreate $this")
    }
}