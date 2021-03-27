package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class GenericGridProfileRequest {
    Map<String,Object> map=new HashMap<>();


    public String getRequestType(){
        //return new RequestType();
        return "UPDATE";
    }
    public Map<String,Object> getCategoryMap(){
return    map   ;
    }

}
