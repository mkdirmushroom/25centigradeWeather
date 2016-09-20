package com.mushroom.twentyFiveCentigradeWeather.util;

/**
 * Created by wmm on 2016/9/19.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
