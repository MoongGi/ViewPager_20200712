package kr.co.tjoeun.viewpager_20200712

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity :AppCompatActivity()
{
    var mContext = this

    abstract fun setValues()
    abstract fun setupEvents()
}