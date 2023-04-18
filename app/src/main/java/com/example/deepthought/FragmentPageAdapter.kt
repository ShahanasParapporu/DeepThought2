package com.example.deepthought

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.deepthought.Fragments.Dashboard
import com.example.deepthought.Fragments.Explore
import com.example.deepthought.Fragments.SocialScorecard

class FragmentPageAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0)
            Explore()
        else if (position==1)
            Dashboard()
        else
            SocialScorecard()
    }
}