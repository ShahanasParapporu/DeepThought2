package com.example.deepthought

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.deepthought.databinding.ActivityMainBinding
import com.example.deepthought.model.JsonData
import com.google.android.material.tabs.TabLayout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.nio.file.attribute.PosixFileAttributeView

class MainActivity : AppCompatActivity() {


    //Project flow:

    //MainActivity consists of basic design, tabLayout, Fragments
    //In Explore Fragment -> RecyclerView is setup
    //SingleItem design for this RecyclerView is present in list_item_explore xml layout.
    //Adapter for this recyclerView is the ProjectAdapter.
    //The adapter is set to the recyclerView in explore fragment.
    /* I have done 80% of data rendering from the json however i encountered some errors while running.
     Therefore the code for rendering data from json is commented in explore fragment*/

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: FragmentPageAdapter
    //private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewPager2)

        adapter = FragmentPageAdapter(supportFragmentManager, lifecycle)

        tabLayout.addTab(tabLayout.newTab().setText("Explore"))
        tabLayout.addTab(tabLayout.newTab().setText("Dashboard"))
        tabLayout.addTab(tabLayout.newTab().setText("Social Scorecard"))

        viewPager2.adapter = adapter

        tabLayout.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    viewPager2.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

        viewPager2.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })
    }




}