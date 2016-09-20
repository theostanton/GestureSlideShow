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

Adapters
--------

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
