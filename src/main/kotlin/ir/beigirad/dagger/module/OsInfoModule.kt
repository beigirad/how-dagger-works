package ir.beigirad.dagger.module

import dagger.Module
import dagger.Provides
import ir.beigirad.dagger.util.OsInfo
import java.util.Properties

// module that has argument in its constructor
@Module
class OsInfoModule(private val systemProperties: Properties) {
    @Provides
    fun provideLibrariesPath() = OsInfo(
        name = systemProperties.getProperty("os.name"),
        version = systemProperties.getProperty("os.version"),
        arch = systemProperties.getProperty("os.arch")
    )
}

