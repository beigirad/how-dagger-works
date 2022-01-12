package ir.beigirad.screen_a

import dagger.Module
import dagger.Provides

@Module
class ScreenAModule {
    @Provides
    fun provideInfo(): RelatedAObject {
        return RelatedAObject(name = "Feature * A *")
    }
}