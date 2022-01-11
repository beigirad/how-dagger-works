package ir.beigirad.dagger

import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val capitalizer: Capitalizer
) : Repository {
    override fun getUsersName(): List<String> {
        return listOf("mamad", "gholi").map { capitalizer.capitalize(it) }
    }
}