package ir.beigirad.dagger

import ir.beigirad.dagger.module.OsInfoModule
import ir.beigirad.dagger.util.Context
import ir.beigirad.dagger.util.OsInfo
import javax.inject.Inject
import javax.inject.Named

class MyApplication {
    @Inject
    lateinit var repository: Repository

    @Inject
    lateinit var osInfo: OsInfo

    @Named("B")
    @Inject
    lateinit var capitalizer: Capitalizer

    fun runApp() {
        DaggerAppComponent.factory()
            .create(
                context = Context(),
                os = OsInfoModule(System.getProperties())
            )
            .inject(this)

        val users = repository.getUsersName()
        println("users: $users")

        println("osInfo: $osInfo")

        println(capitalizer.capitalize("hello!"))
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) = MyApplication().runApp()
    }
}