package com.example.but.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by But on 2017/10/9.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private  int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;

    }
    public String getcountyName(){
        return countyName;
    }
    public void setcountyName(String countyName){
        this.countyName=countyName;

    }
    public String getWeatherId(){
        return weatherId;

    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
