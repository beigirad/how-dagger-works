package ir.beigirad.app.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams.MATCH_PARENT
import android.widget.TextView
import androidx.core.view.setPadding
import androidx.core.widget.TextViewCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import ir.beigirad.app.logger.Logger
import ir.beigirad.app.repository.Repository
import ir.beigirad.app.toPx
import ir.beigirad.app.viewmodel.HomeViewModel
import javax.inject.Inject

@AndroidEntryPoint(Fragment::class)
class HomeFragment : Hilt_HomeFragment() {
    @Inject
    lateinit var logger: Logger

    @Inject
    lateinit var repository: Repository

    lateinit var viewmodel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger.say("onCreate $this: $savedInstanceState")

        viewmodel = ViewModelProvider(this).get()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return LinearLayout(inflater.context).apply {
            layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT)
            orientation = LinearLayout.VERTICAL
            setPadding(16.toPx)

            addView(TextView(context).apply {
                text = "Home"
                TextViewCompat.setTextAppearance(this, android.R.style.TextAppearance_Large)
            })

            addView(Button(context).apply {
                text = "Go to next"
                setOnClickListener { findNavController().navigate("second") }
            })
        }
    }
}
