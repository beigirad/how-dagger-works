package ir.beigirad.dagger

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import ir.beigirad.dagger.util.Context
import ir.beigirad.logger.Logger

class AssistedObject @AssistedInject constructor(
    private val logger: Logger,
    context: Context,
    @Assisted private val id: Int
) {
    @AssistedFactory
    interface Factory {
        fun create(id: Int): AssistedObject
    }

    init {
        logger.log("Assisted Object has created with id=$id")
    }

    fun doSth() {
        logger.log("I'm doing sth...")
    }
}