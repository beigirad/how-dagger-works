package ir.beigirad.dagger

import dagger.Component
import ir.beigirad.dagger.module.AppModule

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: MyApplication)
}