package ir.beigirad.dagger.module

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import ir.beigirad.dagger.interception.AInterceptor
import ir.beigirad.dagger.interception.BInterceptor
import ir.beigirad.dagger.interception.Interceptor

@Module
interface InterceptorModule {
    @IntoMap
    @StringKey("I_A")
    @Binds
    fun bindAInterceptor(a: AInterceptor): Interceptor

    @IntoMap
    @StringKey("I_B")
    @Binds
    fun bindBInterceptor(b: BInterceptor): Interceptor
}

