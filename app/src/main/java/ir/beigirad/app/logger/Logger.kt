package ir.beigirad.app.logger

import android.util.Log
import javax.inject.Inject

class Logger @Inject constructor() {
    fun say(message: String) {
        Log.i("TAG", message)
    }
}