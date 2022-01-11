package ir.beigirad.logger

import dagger.BindsInstance
import dagger.Component
import ir.beigirad.dagger.util.Context

@Component(modules = [LoggerModule::class])
interface LoggerComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): LoggerComponent
    }

    fun exposeLogger(): Logger
}