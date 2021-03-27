package com.example.tranformer;

import com.example.demo.GenericProfilAxonRequest;
import com.example.demo.GridProfileRequestsMap;
import org.apache.logging.log4j.LogManager;

import java.util.logging.Logger;

public class GridRequestTransformer {
private static final Logger LOGGER= (Logger) LogManager.getLogger(GridRequestTransformer.class);
public GridProfileRequestsMap tranform(final GenericProfilAxonRequest genericProfileAxonRequest){
return new GridProfileRequestsMap();
}
}
