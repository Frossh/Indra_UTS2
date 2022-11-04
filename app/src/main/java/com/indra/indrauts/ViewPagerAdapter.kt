package com.indra.indrauts

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {
            private val Jumlah_Menu = 3
    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> { return MyFriendsFragment()}
            1 -> { return GithubFragment()}
            2 -> { return ProfileFragment()}
            else -> { return GithubFragment()}
        }
    }

    override fun getItemCount(): Int {
        return Jumlah_Menu
    }
}