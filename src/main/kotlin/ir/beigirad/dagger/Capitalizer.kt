package ir.beigirad.dagger

import java.util.Locale

class Capitalizer(private val locale: Locale) {
    fun capitalize(name: String): String {
        return name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }
    }
}