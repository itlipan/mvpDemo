package com.example.lee.androidmvp_10.view;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;

/**
 * Created by Lee on 2016/2/16.
 */
public interface IViewMainActivity {

    void changeImageByBitmapCache(BitmapDrawable bitmapDrawable);

    void goToSaveInfo(Intent intent);
}
