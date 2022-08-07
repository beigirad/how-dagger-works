package ir.beigirad.app.repository

import androidx.fragment.app.Fragment
import ir.beigirad.app.hashString
import javax.inject.Inject

class Repository @Inject constructor(
    private val fragment: Fragment
) {
    init {
        println("Repository has created. ${this.hashString()}")
    }

    fun getUsersName(): List<String> =
        listOf("mamad", "gholi")
}