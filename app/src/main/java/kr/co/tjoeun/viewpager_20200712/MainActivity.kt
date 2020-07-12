package kr.co.tjoeun.viewpager_20200712

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.viewpager_20200712.adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
    }

    override fun setValues() {
        mvpa = MainViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = mvpa
//        TODO("Not yet implemented")
    }

    override fun setupEvents() {
//        TODO("Not yet implemented")
    }
}
