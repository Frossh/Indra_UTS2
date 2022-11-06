package com.indra.indrauts

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_github.*

class MainActivity : AppCompatActivity() {
    val menuTeks = arrayOf("Logo", "Tentang", "Profil")
    val menuIcon = arrayOf(R.drawable.home_svgrepo_com, R.drawable.link_gmbr, R.drawable.profile_svgrepo_com)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter);
        TabLayoutMediator(tab_layout, view_pager, TabLayoutMediator.TabConfigurationStrategy{ tab, position ->
            tab.text=menuTeks[position]
            tab.icon=ResourcesCompat.getDrawable(resources,menuIcon[position], null)
        }).attach()
    }
}