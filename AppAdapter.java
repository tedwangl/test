package com.annaru.wanglei.test;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by wanglei on 2018/2/27.
 */

public abstract class AppAdapter {

    @BindingAdapter(value = {"url","placeholder"},requireAll = false)
    public abstract void setImage(ImageView imageView,String url,int placeHolder);
}
