package ir.beigirad.dagger

import dagger.BindsInstance
import dagger.Component
import ir.beigirad.dagger.module.AppModule
import ir.beigirad.dagger.module.DataModule
import ir.beigirad.dagger.module.OsInfoModule
import ir.beigirad.dagger.util.Context
import ir.beigirad.logger.LoggerComponent
import ir.beigirad.screen_a.ScreenASubcomponent
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        DataModule::class,
        OsInfoModule::class,
    ],
    dependencies = [LoggerComponent::class]
)
interface AppComponent {
    fun inject(app: MyApplication)

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context,
            os: OsInfoModule,
            loggerComponent: LoggerComponent
        ): AppComponent
    }

    fun screenAComponent(): ScreenASubcomponent.Builder
}