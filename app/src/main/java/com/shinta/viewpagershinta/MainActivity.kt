package com.shinta.viewpagershinta

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val menuText = arrayOf("Github", "Friends", "Profile")
    private val menuIcon = arrayOf(R.drawable.ic_home, R.drawable.ic_addfriends, R.drawable.ic_profile)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPageAdapter(this)
        view_pager.setAdapter(adapter)
        TabLayoutMediator(tab_layout, view_pager, TabLayoutMediator.TabConfigurationStrategy { tab, position ->
            tab.text = menuText[position]
            tab.icon = ResourcesCompat.getDrawable(
                resources, menuIcon[position], null
            )
        }).attach()
    }
}