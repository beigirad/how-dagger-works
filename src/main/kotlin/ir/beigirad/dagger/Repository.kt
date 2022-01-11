package ir.beigirad.dagger

import javax.inject.Inject

class Repository @Inject constructor(
    private val capitalizer: Capitalizer
) {
    fun getUsersName(): List<String> {
        return listOf("mamad", "gholi").map { capitalizer.capitalize(it) }
    }
}