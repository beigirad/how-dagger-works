package ir.beigirad.logger

import dagger.Component

@Component(modules = [LoggerModule::class])
interface LoggerComponent {
    fun exposeLogger(): Logger
}