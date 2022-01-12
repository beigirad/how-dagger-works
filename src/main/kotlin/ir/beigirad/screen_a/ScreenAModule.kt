package ir.beigirad.screen_a

import dagger.Module
import dagger.Provides

@Module
class ScreenAModule(val type: String) {
    @Provides
    fun provideInfo(): RelatedAObject {
        return RelatedAObject(name = "Feature * A *. type=$type")
    }
}