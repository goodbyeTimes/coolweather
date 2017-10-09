package com.example.but.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by But on 2017/10/9.
 */

public class City extends DataSupport{
    private int id;
    private String cityName;
    private int cityCode;
    private  int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;

    }
    public String getcityName(){
        return cityName;
    }
    public void setcityName(String cityName){
        this.cityName=cityName;

    }
    public int getcityCode(){
        return cityCode;

    }
    public void setcityCode(){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
