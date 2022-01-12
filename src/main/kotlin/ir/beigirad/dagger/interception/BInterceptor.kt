package ir.beigirad.dagger.interception

import javax.inject.Inject

class BInterceptor @Inject constructor() : Interceptor {
    override fun intercept(input: String): String {
        return listOf("B", input).joinToString(separator = " ")
    }
}