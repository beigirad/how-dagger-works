package ir.beigirad.screen_a

import ir.beigirad.dagger.DaggerAppComponent
import ir.beigirad.dagger.module.OsInfoModule
import ir.beigirad.dagger.util.Context
import ir.beigirad.logger.DaggerLoggerComponent
import ir.beigirad.logger.Logger
import javax.inject.Inject

class ScreenA {

    @Inject
    lateinit var relatedObject: RelatedAObject

    @Inject
    lateinit var logger: Logger

    fun launch() {
        DaggerAppComponent.factory()
            .create(
                context = Context(),
                os = OsInfoModule(System.getProperties()),
                loggerComponent = DaggerLoggerComponent.factory().create(Context())
            )
            .screenAComponent()
            .module(ScreenAModule("A"))
            .build()
            .inject(this)

        logger.log("info: $relatedObject")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) = ScreenA().launch()
    }
}