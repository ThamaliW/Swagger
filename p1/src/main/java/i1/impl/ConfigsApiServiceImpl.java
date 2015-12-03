package i1.impl;

import i1.*;
import i1.dto.*;



import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;

public class ConfigsApiServiceImpl extends ConfigsApiService {
    @Override
    public Response configsAlgorithmsGet(){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response configsAlgorithmsAlgorithmNameGet(String algorithmName){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response configsAlgorithmsAlgorithmNameHyperParamsGet(String algorithmName){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response configsDasTablesGet(){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response configsSummaryStatSettingsGet(){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
