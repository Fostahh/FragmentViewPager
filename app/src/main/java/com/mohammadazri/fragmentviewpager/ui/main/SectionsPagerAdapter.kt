package com.mohammadazri.fragmentviewpager.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.mohammadazri.fragmentviewpager.Home
import com.mohammadazri.fragmentviewpager.Profile
import com.mohammadazri.fragmentviewpager.R
import com.mohammadazri.fragmentviewpager.Search

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3,
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        var main_fragment: Fragment? = null
        val home_fragment = Home()
        val search_fragment = Search()
        val profile_fragment = Profile()

        when (position) {
            0 -> {
                main_fragment = home_fragment
                true
            }

            1 -> {
                main_fragment = search_fragment
                true
            }

            2 -> {
                main_fragment = profile_fragment
                true
            }

            else -> false
        }

        return main_fragment!!
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 3 total pages. Look at line 12 to change the amount of page
        return 3
    }
}