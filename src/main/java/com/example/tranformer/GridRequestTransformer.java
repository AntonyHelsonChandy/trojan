package com.example.tranformer;

import com.example.demo.*;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class GridRequestTransformer {
private static final Logger LOGGER=  LogManager.getLogger(GridRequestTransformer.class);
    final Set<ppRequest> ppCategoryRequestSet=new LinkedHashSet<>();
public GridProfileRequestsMap tranform(final GenericProfilAxonRequest genericProfileAxonRequest){
    LOGGER.debug("Starting transform with GRidProfileAxonRequest");

    try{
final GenericGridProfileRequest genericGridProfileRequest=this.buildGenericGridProfileRequest(genericProfileAxonRequest);
//final RequestType requestTpe=genericGridProfileRequest.getRequestType();
final String requestTpe=genericGridProfileRequest.getRequestType();

final Map<String,Object> categoryMap=genericGridProfileRequest.getCategoryMap();
        LOGGER.debug("Number of categories in request{}",categoryMap.size());
        if("UPDATE".equals(requestTpe)){
this.transformEachUpdateCategory(genericGridProfileRequest, ppRequest->{
System.out.println("helson");
});
        }

        else{

        }

    }
    catch(Exception e){

    }
    finally {

    }
return new GridProfileRequestsMap();
}

public GenericGridProfileRequest buildGenericGridProfileRequest( final GenericProfilAxonRequest s){
    GenericGridProfileRequest obj=  new GenericGridProfileRequest();
    return obj ;
}

private void transformEachUpdateCategory(final GenericGridProfileRequest g, final Consumer<ppRequest>  p){

}
}
