package ir.beigirad.dagger.module

import dagger.Module
import dagger.Provides
import ir.beigirad.dagger.Capitalizer
import ir.beigirad.dagger.qualifier.TypeA
import ir.beigirad.dagger.qualifier.TypeB
import java.util.Locale

@Module
class AppModule {
    @TypeA
    @Provides
    fun provideCapitalizer(locale: Locale): Capitalizer {
        return Capitalizer(locale, "A")
    }

    @TypeB
    @Provides
    fun provideCapitalizerB(locale: Locale): Capitalizer {
        return Capitalizer(locale, "B")
    }

    @Provides
    fun provideLocale(): Locale {
        return Locale.getDefault()
    }
}