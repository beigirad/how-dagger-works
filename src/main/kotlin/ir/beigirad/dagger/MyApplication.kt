package ir.beigirad.dagger

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

    fun runApp() {
        val component = DaggerAppComponent.factory()
            .create(
                context = Context(),
                os = OsInfoModule(System.getProperties()),
                loggerComponent = DaggerLoggerComponent.create()
            )

        component.inject(this)
        component.inject(this)

        val users = repository.getUsersName()
        logger.log("users: $users")

        logger.log("osInfo: $osInfo")

        logger.log(capitalizer.capitalize("hello!"))
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) = MyApplication().runApp()
    }
}