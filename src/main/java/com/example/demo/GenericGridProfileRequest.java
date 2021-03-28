package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class GenericGridProfileRequest {
    Map<String,Object> map=new HashMap<>();


    public RequestType getRequestType(){
        return new RequestType();

    }
    public Map<String,Object> getCategoryMap(){
return    map   ;
    }

}
