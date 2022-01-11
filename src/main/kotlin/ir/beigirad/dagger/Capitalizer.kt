package ir.beigirad.dagger

import java.util.Locale

class Capitalizer(private val locale: Locale, type: String) {
    init {
        println("Capitalizer type=$type has created.")
    }

    fun capitalize(name: String): String {
        return name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }
    }
}