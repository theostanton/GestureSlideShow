package com.theostanton.gestureslideshowsample

import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.theostanton.gestureslideshow.BitmapImageAdapter
import com.theostanton.gestureslideshow.DrawableResImageAdapter
import com.theostanton.gestureslideshow.GestureViewPager
import com.theostanton.gestureslideshowpicasso.PicassoImageAdapter
import org.jetbrains.anko.find

class MainActivity : AppCompatActivity() {

    val urls = arrayOf(
            "http://kurld.com/images/wallpapers/cake-image/cake-image-2.jpg",
            "http://kurld.com/images/wallpapers/cake-image/cake-image-20.jpg",
            "http://www.picsymag.com/wp-content/uploads/2016/03/14-3-large.jpg"
    )

    val drawableReses = arrayOf(R.drawable.bfg_1,R.drawable.bfg_2,R.drawable.bfg_3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = find<GestureViewPager>(R.id.viewpager)
        viewPager.adapter = getBitmapImageAdapter()
        viewPager.currentItem = 2
    }

    fun getDrawableResImageAdapter() = DrawableResImageAdapter(drawableReses)

    fun getPicassoImageAdapter() = PicassoImageAdapter(urls)

    fun getBitmapImageAdapter() : BitmapImageAdapter {
        val bitmaps = arrayOf(
                BitmapFactory.decodeResource(resources,R.drawable.bfg_1),
                BitmapFactory.decodeResource(resources,R.drawable.bfg_2),
                BitmapFactory.decodeResource(resources,R.drawable.bfg_3)
        )
        return BitmapImageAdapter(bitmaps)
    }
}
