package ir.beigirad.screen_a

import ir.beigirad.dagger.DaggerAppComponent
import ir.beigirad.dagger.module.OsInfoModule
import ir.beigirad.dagger.util.Context
import ir.beigirad.logger.DaggerLoggerComponent
import javax.inject.Inject

class ScreenA {

    @Inject
    lateinit var relatedObject: RelatedAObject

    fun launch() {
        DaggerAppComponent.factory()
            .create(
                context = Context(),
                os = OsInfoModule(System.getProperties()),
                loggerComponent = DaggerLoggerComponent.factory().create(Context())
            )
            .screenAComponent(ScreenAModule("A"))
            .inject(this)

        println("info: $relatedObject")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) = ScreenA().launch()
    }
}