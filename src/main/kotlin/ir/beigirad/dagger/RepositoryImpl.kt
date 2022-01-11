package ir.beigirad.dagger

import ir.beigirad.dagger.util.Context
import javax.inject.Inject
import javax.inject.Named

class RepositoryImpl @Inject constructor(
    private val context: Context,
    @Named("A") private val capitalizer: Capitalizer
) : Repository {
    override fun getUsersName(): List<String> {
        return listOf("mamad", "gholi").map { capitalizer.capitalize(it) }
    }
}