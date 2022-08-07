package ir.beigirad.app.screens

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import android.widget.TextView
import androidx.core.view.setPadding
import androidx.core.widget.TextViewCompat
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import ir.beigirad.app.logger.Logger
import ir.beigirad.app.repository.Repository
import ir.beigirad.app.toPx
import javax.inject.Inject

@AndroidEntryPoint(Fragment::class)
class SecondFragment : Hilt_SecondFragment() {
    @Inject
    lateinit var logger: Logger

    @Inject
    lateinit var repository: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger.say("onCreate $this: $savedInstanceState")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return LinearLayout(inflater.context).apply {
            layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            setPadding(16.toPx)

            addView(TextView(context).apply {
                text = "Second Screen"
                TextViewCompat.setTextAppearance(this, android.R.style.TextAppearance_Large)
            })
        }
    }
}