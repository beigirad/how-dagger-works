package ir.beigirad.dagger

import ir.beigirad.dagger.util.Context
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val context: Context,
    private val capitalizer: Capitalizer
) : Repository {
    override fun getUsersName(): List<String> {
        return listOf("mamad", "gholi").map { capitalizer.capitalize(it) }
    }
}