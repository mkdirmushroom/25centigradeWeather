package com.mushroom.twentyFiveCentigradeWeather.modle;

/**
 * Created by wmm on 2016/9/18.
 */

public class County {

    private int id;
    private String CountyName;
    private String CountyCode;
    private int CityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String CountyName) {
        this.CountyName = CountyName;
    }

    public String getCountyCode() {
        return CountyCode;
    }

    public void setCountyCode(String CountyCode) {
        this.CountyCode = CountyCode;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int CityId) {
        this.CityId = CityId;
    }
}
