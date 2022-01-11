package ir.beigirad.dagger

import java.util.Locale

class Capitalizer(type: String) {
    init {
        println("Capitalizer type=$type has created.")
    }

    fun capitalize(name: String): String {
        return name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }
}