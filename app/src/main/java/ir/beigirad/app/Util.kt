package ir.beigirad.app

import android.content.res.Resources
import androidx.navigation.NavController

fun NavController.backStackString(): String =
    this@backStackString.backQueue.joinToString(
        prefix = "backstack: [\n",
        postfix = "\n]",
        separator = "\n",
        transform = { "${it.destination.route}\t >>    ${it.destination}" }
    )

val Int.toPx get() = (this * Resources.getSystem().displayMetrics.density).toInt()

fun Any.hashString(): String = "@${this.hashCode().toString(16)}"