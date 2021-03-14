package com.github.goutarouh.androidimplements.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.github.goutarouh.androidimplements.main.recyclerview1.RecyclerView1Fragment

private const val NUM_PAGES = 10

class MainViewPager2Adapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> RecyclerView1Fragment()
            else -> {
                //todo 機能別のフラグメントを追加していく。
                RecyclerView1Fragment()
            }
        }
    }

}