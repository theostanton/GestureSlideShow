GestureSlideShow
================

Incomplete / Work in progress. 

An image slideshow with panning and zooming.

Download
--------

Gradle:
```groovy
compile 'com.theostanton.gestureslideshow:gestureslideshow:0.1.2'
compile 'com.theostanton.gestureslideshowpicasso:gestureslideshowpicasso:0.1.2'
```

Video
-----

[![Video on youtube](https://img.youtube.com/vi/wYGH1RMZiOE/0.jpg)](https://youtu.be/wYGH1RMZiOE)

XML
---

Must use a GestureViewPager in layout

```xml
<com.theostanton.gestureslideshow.GestureViewPager
        android:id="@+id/viewPager"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```

Adapters
--------

And then any of the following adapters


### DrawableResImageAdapter

```Java
DrawableResImageAdapter adapter = new DrawableResImageAdapter(
    new int[]{R.drawable.bfg_1,R.drawable.bfg_2,R.drawable.bfg_3}
);
```

### BitmapImageAdapter

```Java
BitmapImageAdapter adapter = new BitmapImageAdapter(
    new Bitmap[]{bitmap_1,bitmap_2,bitmap_3}
);
```
### CustomImageAdapter

```Java
CustomImageAdapter<String> adapter = new CustomImageAdapter<>(
    urls,
    new ImageLoader<String>() {
        @Override
        public void load(@NotNull GestureImageView imageView, String item) {
            // Your code to load image to imageView
            // i.e.
            imageView.setImageUrl(item);
        }
    }
);
```


