package com.shinta.viewpagershinta

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPageAdapter(fragmentActivity: FragmentActivity):
    FragmentStateAdapter(fragmentActivity){
        private val jml_menu = 3
    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> {return GithubFragment()}
            1 -> {return FriendsFragment()}
            2 -> {return ProfileFragment()}
            else -> {return GithubFragment()}
        }
    }

    override fun getItemCount(): Int {
        return jml_menu
    }
    }