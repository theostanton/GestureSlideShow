package com.theostanton.gestureslideshowsample;

import com.theostanton.gestureslideshow.CustomImageAdapter;
import com.theostanton.gestureslideshow.ImageLoader;
import com.theostanton.gestureslideshow.gestureimageview.GestureImageView;

import org.jetbrains.annotations.NotNull;

/**
 * Created by theostanton on 20/09/2016.
 */

public class Temp {

    public static void lols(){
        new CustomImageAdapter<String>(null, new ImageLoader<String>() {
            @Override
            public void load(@NotNull GestureImageView imageView, String item) {

            }
        });
    }

}
