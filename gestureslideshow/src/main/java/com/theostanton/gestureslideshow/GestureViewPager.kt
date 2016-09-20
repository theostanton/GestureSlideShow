package com.theostanton.gestureslideshow

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent
import com.theostanton.gestureslideshow.gestureimageview.GestureImageView

/**
 * Created by theostanton on 20/09/2016.
 */
class GestureViewPager : ViewPager {

    constructor(context: Context?) : this(context,null)

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs){
        offscreenPageLimit = 10
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        for(i in 0..childCount){
            val child = getChildAt(i) as GestureImageView? ?: break
            if(child.position==i && child.isInZoom){
                return false
            }
        }
        return super.onInterceptTouchEvent(ev)
    }
}