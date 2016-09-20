package com.theostanton.gestureslideshowsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.theostanton.gestureslideshow.ImageAdapter;
import com.theostanton.gestureslideshow.ImageAdapterKt;

public class JavaMainActivity extends AppCompatActivity {

    int[] drawableRes = {R.drawable.bfg_1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageAdapter imageAdapter = ImageAdapterKt.drawableResources(drawableRes);

    //        Bitmap bitmap_1,bitmap_2,bitmap_3 = null;
    //
    //        CustomImageAdapter<String> adapter = new CustomImageAdapter<>(
    //                urls,
    //                new ImageLoader<String>() {
    //                    @Override
    //                    public void load(@NotNull GestureImageView imageView, String item) {
    //                        // Your code to load image to imageView
    //                        // i.e.
    //                        imageView.setImageUrl(item);
    //                    }
    //                }
    //        );

    }


}
