package ir.beigirad.dagger

import dagger.Component
import ir.beigirad.dagger.module.AppModule
import ir.beigirad.dagger.module.DataModule
import ir.beigirad.dagger.module.OsInfoModule

@Component(
    modules = [
        AppModule::class,
        DataModule::class,
        OsInfoModule::class,
    ]
)
interface AppComponent {
    fun inject(app: MyApplication)
}