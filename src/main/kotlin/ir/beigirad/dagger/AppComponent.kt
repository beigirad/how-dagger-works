package ir.beigirad.dagger

import dagger.BindsInstance
import dagger.Component
import ir.beigirad.dagger.module.AppModule
import ir.beigirad.dagger.module.DataModule
import ir.beigirad.dagger.module.OsInfoModule
import ir.beigirad.dagger.util.Context
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        DataModule::class,
        OsInfoModule::class,
    ]
)
interface AppComponent {
    fun inject(app: MyApplication)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context, os: OsInfoModule): AppComponent
    }
}