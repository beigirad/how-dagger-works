package ir.beigirad.dagger

import java.util.Locale
import javax.inject.Inject

class Capitalizer {
    fun capitalize(name: String): String {
        return name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }
}