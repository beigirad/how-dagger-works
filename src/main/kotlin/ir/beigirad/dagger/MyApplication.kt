package ir.beigirad.dagger

import javax.inject.Inject

class MyApplication {
    @Inject
    lateinit var repository: Repository

    fun runApp() {
        DaggerAppComponent.create()
            .inject(this)

        val users = repository.getUsersName()
        println("users: $users")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) = MyApplication().runApp()
    }
}