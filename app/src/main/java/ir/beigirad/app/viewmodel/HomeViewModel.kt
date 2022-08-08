package ir.beigirad.app.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ir.beigirad.app.hashString
import ir.beigirad.app.logger.Logger
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val logger: Logger
) : ViewModel() {
    init {
        logger.say("HomeViewModel has created. ${this.hashString()}")
    }
}