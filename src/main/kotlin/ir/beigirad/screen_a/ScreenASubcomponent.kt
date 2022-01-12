package ir.beigirad.screen_a

import dagger.Subcomponent

@Subcomponent(modules = [ScreenAModule::class])
interface ScreenASubcomponent {
    fun inject(screenA: ScreenA)

    @Subcomponent.Builder
    interface Builder {
        fun module(screenAModule: ScreenAModule): Builder
        fun build(): ScreenASubcomponent
    }
}