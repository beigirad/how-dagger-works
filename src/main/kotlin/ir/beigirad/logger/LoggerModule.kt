package ir.beigirad.logger

import dagger.Module
import dagger.Provides

@Module
class LoggerModule {
    @Provides
    fun provideLogger(): Logger {
        return Logger()
    }
}