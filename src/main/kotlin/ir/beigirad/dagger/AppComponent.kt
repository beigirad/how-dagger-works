package ir.beigirad.dagger

import dagger.BindsInstance
import dagger.Component
import ir.beigirad.dagger.module.AppModule
import ir.beigirad.dagger.module.DataModule
import ir.beigirad.dagger.module.OsInfoModule
import ir.beigirad.dagger.util.Context

@Component(
    modules = [
        AppModule::class,
        DataModule::class,
        OsInfoModule::class,
    ]
)
interface AppComponent {
    fun inject(app: MyApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder
        fun os(os: OsInfoModule): Builder
        fun build(): AppComponent
    }
}