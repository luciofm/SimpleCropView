package com.isseiaoki.simplecropview.callback;


import android.graphics.Bitmap;

public interface LoadCallback extends Callback{
    void onSuccess(Bitmap sampledBitmap);
    void onError();
}
