package com.example.electorsparties

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_dashboard -> {
                    openFragment(DashboardFragment())
                    true
                }
                R.id.nav_electors -> {
                    openFragment(ElectorsFragment())
                    true
                }
                R.id.nav_parties -> {
                    openFragment(PartiesFragment())
                    true
                }
                else -> false
            }
        }

        // Set default fragment
        bottomNavigation.selectedItemId = R.id.nav_dashboard
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
