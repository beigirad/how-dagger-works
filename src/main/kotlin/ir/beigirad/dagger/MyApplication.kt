package ir.beigirad.dagger

import ir.beigirad.dagger.module.OsInfoModule
import ir.beigirad.dagger.util.Context
import ir.beigirad.dagger.util.OsInfo
import javax.inject.Inject

class MyApplication {
    @Inject
    lateinit var repository: Repository

    @Inject
    lateinit var osInfo: OsInfo

    fun runApp() {
        DaggerAppComponent.builder()
            .context(Context())
            .os(OsInfoModule(System.getProperties()))
            .build()
            .inject(this)

        val users = repository.getUsersName()
        println("users: $users")

        println("osInfo: $osInfo")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) = MyApplication().runApp()
    }
}