package fr.mazelou.triv1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

import fr.mazelou.triv1.fragments.WelcomeFragment
import fr.mazelou.triv1.fragments.HomeFragment
import fr.mazelou.triv1.fragments.ProfileFragment

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loadFragment(HomeFragment(this))

        // Importer le bottomnavigationview
        val navigationView = findViewById<BottomNavigationView>(R.id.navigation_view)
        navigationView.setOnNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.home_page -> {
                    loadFragment(HomeFragment(this))
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.profile_page -> {
                    loadFragment(ProfileFragment(this))
                    return@setOnNavigationItemSelectedListener true
                }
                else -> false
            }
        }

    }

    private fun loadFragment(fragment: Fragment) {

        // Injecter le fragment dans notre boite (fragment_container)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}