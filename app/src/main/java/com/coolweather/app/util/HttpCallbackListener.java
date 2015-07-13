package com.coolweather.app.util;

/**
 * Created by lenovo on 2015/7/11.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
