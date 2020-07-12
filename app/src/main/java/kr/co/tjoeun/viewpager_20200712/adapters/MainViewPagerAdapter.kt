package kr.co.tjoeun.viewpager_20200712.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.viewpager_20200712.Fragments.FirstFagment
import kr.co.tjoeun.viewpager_20200712.Fragments.SecondFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm)
{
    override fun getItem(position: Int): Fragment {
        if (position == 0)
        {
            return FirstFagment()
        }
        else
        {
            return SecondFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

}