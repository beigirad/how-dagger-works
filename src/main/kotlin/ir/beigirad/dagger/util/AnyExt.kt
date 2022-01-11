package ir.beigirad.dagger.util

fun Any.hashString(): String = "@${this.hashCode().toString(16)}"