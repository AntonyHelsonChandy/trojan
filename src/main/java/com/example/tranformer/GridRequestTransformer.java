package com.example.tranformer;

import com.example.demo.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.function.Consumer;

public class GridRequestTransformer {
private static final Logger LOGGER=  LogManager.getLogger(GridRequestTransformer.class);
final Set<ppRequest> ppCategoryRequestSet=new LinkedHashSet<>();
final Map<Integer,Object> originalRequestMap= new HashMap<>();
final Set<List<ppRequest>> ppMultiStepRequestSet=new LinkedHashSet<>();

public GridProfileRequestsMap tranform(final GenericProfilAxonRequest genericProfileAxonRequest){
    LOGGER.debug("Starting transform with GRidProfileAxonRequest");
    try{
final GenericGridProfileRequest genericGridProfileRequest=this.buildGenericGridProfileRequest(genericProfileAxonRequest);
final RequestType requestTpe=genericGridProfileRequest.getRequestType();
final Map<String,Object> categoryMap=genericGridProfileRequest.getCategoryMap();

LOGGER.debug("Number of categories in request{}",categoryMap.size());

if(RequestType.UPDATE.equals(requestTpe)){
this.transformEachUpdateCategory(genericGridProfileRequest, ppRequest->{
    ppCategoryRequestSet.add(ppRequest);
    originalRequestMap.put(this.getPPRequestMapKey(ppRequest),genericProfileAxonRequest);
});
}
else{
 } }
    catch(Exception e){
        LOGGER.debug("An unexpected transformer exception occures. This message will be skipped. Message:[{}].Exception[{}]",genericProfileAxonRequest,e);
return null;
    }
    finally {

    }
    LOGGER.debug("the tranformation is complete");
return new GridProfileRequestsMap(ppMultiStepRequestSet,ppCategoryRequestSet,originalRequestMap);


}

public GenericGridProfileRequest buildGenericGridProfileRequest( final GenericProfilAxonRequest s){
    GenericGridProfileRequest obj=  new GenericGridProfileRequest();
    String replacementidentifer=null;
    final String identifier;
    final keyConstants keyConstants;
    final Keys genericKey=s.getkeys();

    if(StringUtils.isNotBlank(genericKey.getPan())){
   
    }


    return obj ;
}

private void transformEachUpdateCategory(final GenericGridProfileRequest g, final Consumer<ppRequest>  p){

}
private int  getPPRequestMapKey(final ppRequest p){
    return 2;
}



}
