package ir.beigirad.dagger.module

import dagger.Module
import dagger.Provides
import ir.beigirad.dagger.Capitalizer
import javax.inject.Named

@Module
class AppModule {
    @Named("A")
    @Provides
    fun provideCapitalizer(): Capitalizer {
        return Capitalizer("A")
    }

    @Named("B")
    @Provides
    fun provideCapitalizerB(): Capitalizer {
        return Capitalizer("B")
    }
}