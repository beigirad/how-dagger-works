package ir.beigirad.dagger.module

import dagger.Module
import dagger.Provides
import ir.beigirad.dagger.Capitalizer
import java.util.Locale
import javax.inject.Named

@Module
class AppModule {
    @Named("A")
    @Provides
    fun provideCapitalizer(locale: Locale): Capitalizer {
        return Capitalizer(locale, "A")
    }

    @Named("B")
    @Provides
    fun provideCapitalizerB(locale: Locale): Capitalizer {
        return Capitalizer(locale, "B")
    }

    @Provides
    fun provideLocale(): Locale {
        return Locale.getDefault()
    }
}