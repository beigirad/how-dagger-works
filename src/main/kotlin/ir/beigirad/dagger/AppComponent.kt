package ir.beigirad.dagger

import dagger.Component
import ir.beigirad.dagger.module.AppModule
import ir.beigirad.dagger.module.DataModule

@Component(
    modules = [
        AppModule::class,
        DataModule::class
    ]
)
interface AppComponent {
    fun inject(app: MyApplication)
}