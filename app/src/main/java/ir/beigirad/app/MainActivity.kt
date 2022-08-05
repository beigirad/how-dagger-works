package ir.beigirad.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.createGraph
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.fragment
import ir.beigirad.app.logger.Logger
import ir.beigirad.app.screens.HomeFragment
import ir.beigirad.app.screens.SecondFragment

class MainActivity : AppCompatActivity() {
    lateinit var logger: Logger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger = Logger()
        logger.say("onCreate $this: $savedInstanceState")

        val rootView = FragmentContainerView(this).apply { id = R.id.container_id }
        setContentView(rootView)

        obtainNavHost()

        obtainNavHost().navController.graph = obtainNavHost()
            .createGraph("home") {
                fragment<HomeFragment>("home")
                fragment<SecondFragment>("second")
            }

        obtainNavHost().navController.addOnDestinationChangedListener { controller, _, _ ->
            logger.say(controller.backStackString())
        }
    }

    private fun obtainNavHost(): NavHostFragment {
        val navHost = (supportFragmentManager.findFragmentByTag("Container") as? NavHostFragment)
            ?.also { return it }
            ?: NavHostFragment()

        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_id, navHost, "Container")
            .setPrimaryNavigationFragment(navHost)
            .commitNow()

        return navHost
    }
}