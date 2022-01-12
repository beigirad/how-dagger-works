package ir.beigirad.screen_a

import dagger.Subcomponent

@Subcomponent(modules = [ScreenAModule::class])
interface ScreenASubcomponent {
    fun inject(screenA: ScreenA)
}