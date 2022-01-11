package ir.beigirad.dagger

import dagger.Component

@Component
interface AppComponent {
    fun inject(app: MyApplication)
}