package ir.beigirad.logger

import dagger.Module
import dagger.Provides
import ir.beigirad.dagger.util.Context

@Module
class LoggerModule {
    @Provides
    fun provideLogger(context: Context): Logger {
        return Logger(context)
    }
}