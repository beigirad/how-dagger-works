package ir.beigirad.dagger.interception

import javax.inject.Inject

class AInterceptor @Inject constructor() : Interceptor {
    override fun intercept(input: String): String {
        return listOf("A", input).joinToString(separator = " ")
    }
}