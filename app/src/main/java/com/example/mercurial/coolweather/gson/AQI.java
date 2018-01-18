package com.example.mercurial.coolweather.gson;

/**
 * Created by Mercurial on 2018/1/17.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
