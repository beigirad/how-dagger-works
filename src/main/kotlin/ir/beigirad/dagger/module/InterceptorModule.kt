package ir.beigirad.dagger.module

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet
import ir.beigirad.dagger.interception.AInterceptor
import ir.beigirad.dagger.interception.BInterceptor
import ir.beigirad.dagger.interception.Interceptor

@Module
interface InterceptorModule {
    @IntoSet
    @Binds
    fun bindAInterceptor(a: AInterceptor): Interceptor

    @IntoSet
    @Binds
    fun bindBInterceptor(b: BInterceptor): Interceptor
}

