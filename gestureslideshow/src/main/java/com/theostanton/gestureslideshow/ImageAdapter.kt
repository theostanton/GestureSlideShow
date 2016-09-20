package com.theostanton.gestureslideshow

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup
import com.theostanton.gestureslideshow.gestureimageview.GestureImageView

/**
 * Created by theostanton on 19/09/2016.
 */

class CustomImageAdapter(val data: Array<Unit>, val imageLoader: ImageLoader) : ImageAdapter() {

    override fun load(imageView: GestureImageView, position: Int) {
        imageLoader.load(imageView, position)
    }

    override fun getCount() = data.size

}

class DrawableResImageAdapter(val data: Array<Int>) : ImageAdapter() {

    override fun load(imageView: GestureImageView, position: Int) {
        imageView.setImageResource(data[position])
    }

    override fun getCount() = data.size
}

class DrawableImageAdapter(val data: Array<Drawable>) : ImageAdapter() {

    override fun load(imageView: GestureImageView, position: Int) {
        imageView.setImageDrawable(data[position])
    }

    override fun getCount() = data.size
}

class BitmapImageAdapter(val data: Array<Bitmap>) : ImageAdapter() {

    override fun load(imageView: GestureImageView, position: Int) {
        imageView.setImageBitmap(data[position])
    }

    override fun getCount() = data.size
}

abstract class ImageAdapter : PagerAdapter() {

    abstract override fun getCount(): Int

    override fun isViewFromObject(view: View?, obj: Any?) = view == obj

    override fun destroyItem(container: ViewGroup?, position: Int, obj: Any?) {
        if (obj is GestureImageView) {
            obj.removeListener()
        }
        container?.removeView(obj as View)
    }

    abstract fun load(imageView: GestureImageView, position: Int)

    override fun instantiateItem(container: ViewGroup?, position: Int): Any? {
        val imageView = GestureImageView(container?.context)
        imageView.position = position
        load(imageView, position)
        container?.addView(imageView)
        return imageView
    }

}

interface ImageLoader {
    fun load(imageView: GestureImageView, position: Int)
}