package ir.beigirad.dagger.module

import dagger.Module
import dagger.Provides
import ir.beigirad.dagger.Capitalizer
import java.util.Locale

@Module
class AppModule {
    @Provides
    fun provideCapitalizer(locale: Locale): Capitalizer {
        return Capitalizer(locale)
    }

    @Provides
    fun provideLocale(): Locale {
        return Locale.getDefault()
    }
}