package ir.beigirad.logger

import ir.beigirad.dagger.util.Context
import ir.beigirad.dagger.util.hashString

class Logger(context: Context) {

    init {
        println("A new Logger has created. ${this.hashString()}")
    }

    fun log(message: String) {
        println("[Logger]\t$message")
    }
}