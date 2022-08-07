package ir.beigirad.app.logger

import android.content.Context
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class Logger @Inject constructor(
    @ApplicationContext private val context: Context
) {
    fun say(message: String) {
        Log.i("TAG", message)
    }
}