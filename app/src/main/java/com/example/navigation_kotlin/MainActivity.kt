package com.example.navigation_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.navigation_kotlin.fragment.FirstFragment
import com.example.navigation_kotlin.fragment.FourthFragment
import com.example.navigation_kotlin.fragment.SecondFragment
import com.example.navigation_kotlin.fragment.ThirdFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        //setSupportActionBar(toolbar)
        supportActionBar?.title = "DrawerLayout + Fragment"

        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val navigationView: NavigationView = findViewById(R.id.navigationView)

        // Initially display the first fragment in main activity
        replaceFragment(FirstFragment())

        // Drawer toggle click listener
        val toggle: ActionBarDrawerToggle = object:ActionBarDrawerToggle(
            this,drawerLayout,toolbar,
            R.string.drawer_open,R.string.drawer_close
        ){
            override fun onDrawerOpened(drawerView: View) {
                super.onDrawerOpened(drawerView)
            }

            override fun onDrawerClosed(drawerView: View) {
                super.onDrawerClosed(drawerView)
            }
        }

        // Configure drawer layout
        toggle.isDrawerIndicatorEnabled = true
        toggle.syncState()
        drawerLayout.addDrawerListener(toggle)

        // Navigation view item click listener
        navigationView.setNavigationItemSelectedListener {
            drawerLayout.closeDrawer(GravityCompat.START)
            when(it.itemId){
                R.id.first->{
                    replaceFragment(FirstFragment())
                    true
                }
                R.id.second->{
                    replaceFragment(SecondFragment())
                    true
                }
                R.id.third->{
                    replaceFragment(ThirdFragment())
                    true
                }
                R.id.fourth->{
                    replaceFragment(FourthFragment())
                    true
                }
                else->false
            }
        }
    }
}

// Extension function to replace fragment
fun AppCompatActivity.replaceFragment(fragment: Fragment){
    val fragmentManager = supportFragmentManager
    val transaction = fragmentManager.beginTransaction()
    transaction.replace(R.id.host,fragment)
    transaction.addToBackStack(null)
    transaction.commit()
}