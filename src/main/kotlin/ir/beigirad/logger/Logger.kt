package ir.beigirad.logger

import ir.beigirad.dagger.util.Context

class Logger(context: Context) {

    fun log(message: String) {
        println("[Logger]\t$message")
    }
}