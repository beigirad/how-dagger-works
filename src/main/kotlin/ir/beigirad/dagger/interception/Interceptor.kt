package ir.beigirad.dagger.interception

interface Interceptor {
    fun intercept(input: String): String
}