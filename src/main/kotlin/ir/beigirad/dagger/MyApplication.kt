package ir.beigirad.dagger

import ir.beigirad.dagger.interception.Interceptor
import ir.beigirad.dagger.module.OsInfoModule
import ir.beigirad.dagger.qualifier.TypeB
import ir.beigirad.dagger.util.Context
import ir.beigirad.dagger.util.OsInfo
import ir.beigirad.logger.DaggerLoggerComponent
import ir.beigirad.logger.Logger
import javax.inject.Inject

class MyApplication {
    @Inject
    lateinit var repository: Repository

    @Inject
    lateinit var osInfo: OsInfo

    @TypeB
    @Inject
    lateinit var capitalizer: Capitalizer

    @Inject
    lateinit var logger: Logger

    @Inject
    lateinit var interceptors: Map<String, @JvmSuppressWildcards Interceptor>

    fun runApp() {
        val component = DaggerAppComponent.factory()
            .create(
                context = Context(),
                os = OsInfoModule(System.getProperties()),
                loggerComponent = DaggerLoggerComponent.factory().create(Context())
            )

        component.inject(this)
        component.inject(this)

        val users = repository.getUsersName()
        logger.log("users: $users")

        logger.log("osInfo: $osInfo")

        logger.log(capitalizer.capitalize("hello!"))

        // bInterceptor.intercept(aInterceptor.intercept("Bye"))
        interceptors
            .onEach { logger.log("interceptor ${it.key}") }
            .values
            .fold("Bye") { acc, interceptor -> interceptor.intercept(acc) }
            .also { logger.log(it) }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) = MyApplication().runApp()
    }
}