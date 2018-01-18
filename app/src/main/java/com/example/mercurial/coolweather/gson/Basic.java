package com.example.mercurial.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Mercurial on 2018/1/17.
 */

public class Basic {
    @SerializedName("city")  //注解，让JSON字段和Java字段之间建立联系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
