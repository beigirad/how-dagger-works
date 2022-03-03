package ir.beigirad.dagger

import dagger.Lazy
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
    lateinit var capitalizer: Lazy<Capitalizer>

    @Inject
    lateinit var logger: Logger

    @Inject
    lateinit var interceptors: Map<String, @JvmSuppressWildcards Interceptor>

    @Inject
    lateinit var assistedObjectFactory: AssistedObject.Factory

    fun runApp() {
        println("before creating component")
        val component = DaggerAppComponent.factory()
            .create(
                context = Context(),
                os = OsInfoModule(System.getProperties()),
                loggerComponent = DaggerLoggerComponent.factory().create(Context())
            )
        println("after creating component")

        println(">>>>>>> before first inject component")
        component.inject(this)
        println("<<<<<<< after first inject component")

        println(">>>>>>> before second inject component")
        component.inject(this)
        println("<<<<<<< after second inject component")

        val users = repository.getUsersName()
        logger.log("users: $users")

        logger.log("osInfo: $osInfo")

        logger.log(capitalizer.get().capitalize("hello!"))
        logger.log(capitalizer.get().capitalize("hello again!"))

        // bInterceptor.intercept(aInterceptor.intercept("Bye"))
        interceptors
            .onEach { logger.log("interceptor ${it.key}") }
            .values
            .fold("Bye") { acc, interceptor -> interceptor.intercept(acc) }
            .also { logger.log(it) }

        val assistedObject = assistedObjectFactory.create(12)
        assistedObject.doSth()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) = MyApplication().runApp()
    }
}