package com.annaru.wanglei.test;

import android.databinding.DataBindingComponent;

/**
 * Created by wanglei on 2018/2/27.
 */

public class MyComponent implements android.databinding.DataBindingComponent {

    @Override
    public AppAdapter getAppAdapter() {
        return new ImageAdapter();
    }
}
