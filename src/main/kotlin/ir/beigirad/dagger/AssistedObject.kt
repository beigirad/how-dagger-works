package ir.beigirad.dagger

import ir.beigirad.dagger.util.Context
import ir.beigirad.logger.Logger
import javax.inject.Inject

class AssistedObject @Inject constructor(
    private val logger: Logger,
    context: Context
) {
    init {
        logger.log("Assisted Object has created!")
    }

    fun doSth() {
        logger.log("I'm doing sth...")
    }
}