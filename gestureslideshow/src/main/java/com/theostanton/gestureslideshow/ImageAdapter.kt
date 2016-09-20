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

class CustomImageAdapter<T>(val data: Array<T>, val imageLoader: ImageLoader<T>) : ImageAdapter() {

    override fun load(imageView: GestureImageView, position: Int) {
        imageLoader.load(imageView, data[position])
    }

    override fun getCount() = data.size
}


interface ImageLoader<in T> {
    fun load(imageView: GestureImageView, item: T)
}

class DrawableResImageAdapter(val data: IntArray) : ImageAdapter() {

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