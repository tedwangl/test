package com.annaru.wanglei.test;

import android.widget.ImageView;

/**
 * Created by wanglei on 2018/2/27.
 */

public class ImageAdapter extends AppAdapter{

    @Override
    public void setImage(ImageView imageView, String url, int placeHolder) {
        ImgLoadUtil.load(imageView,url,placeHolder);
    }
}
