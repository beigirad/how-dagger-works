package ir.beigirad.dagger.module

import dagger.Module
import dagger.Provides
import ir.beigirad.dagger.Capitalizer
import ir.beigirad.dagger.qualifier.TypeA
import ir.beigirad.dagger.qualifier.TypeB

@Module
class AppModule {
    @TypeA
    @Provides
    fun provideCapitalizer(): Capitalizer {
        return Capitalizer("A")
    }

    @TypeB
    @Provides
    fun provideCapitalizerB(): Capitalizer {
        return Capitalizer("B")
    }
}