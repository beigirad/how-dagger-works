package ir.beigirad.dagger.module

import dagger.Module
import dagger.Provides
import ir.beigirad.dagger.Capitalizer

@Module
class AppModule {
    @Provides
    fun provideCapitalizer(): Capitalizer {
        return Capitalizer()
    }
}