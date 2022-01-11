package ir.beigirad.dagger

import ir.beigirad.dagger.qualifier.TypeA
import ir.beigirad.dagger.util.Context
import ir.beigirad.dagger.util.hashString
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(
    private val context: Context,
    @TypeA private val capitalizer: Capitalizer
) : Repository {
    init {
        println("Repository has created. ${this.hashString()}")
    }

    override fun getUsersName(): List<String> {
        return listOf("mamad", "gholi").map { capitalizer.capitalize(it) }
    }
}