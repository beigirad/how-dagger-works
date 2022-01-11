package ir.beigirad.dagger

class MyApplication {
    lateinit var repository: Repository

    fun runApp() {
        repository = Repository()

        val users = repository.getUsersName()
        println("users: $users")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) = MyApplication().runApp()
    }
}