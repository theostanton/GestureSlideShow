package com.theostanton.gestureslideshowpicasso

import com.squareup.picasso.Picasso
import com.theostanton.gestureslideshow.ImageAdapter
import com.theostanton.gestureslideshow.gestureimageview.GestureImageView

/**
 * Created by theostanton on 20/09/2016.
 */
class PicassoImageAdapter(val urls: Array<String>, val picasso: Picasso?) : ImageAdapter() {

    constructor(urls: Array<String>) : this(urls, null)

    override fun getCount() = urls.size

    override fun load(imageView: GestureImageView, position: Int) {
        if (picasso == null) {
            Picasso.with(imageView.context).load(urls[position]).into(imageView)
        } else {
            picasso.load(urls[position]).into(imageView)
        }
    }
}