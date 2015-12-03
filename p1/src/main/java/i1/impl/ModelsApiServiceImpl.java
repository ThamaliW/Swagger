package i1.impl;

import i1.*;
import i1.dto.*;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import java.io.File;
import java.math.BigDecimal;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;

public class ModelsApiServiceImpl extends ModelsApiService {
    @Override
    public Response modelsGet(){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response modelsPost(){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response modelsPredictModelPost(BigDecimal modelId,String dataFormat,InputStream inputStreamInputStream,Attachment inputStreamDetail){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response modelsStreamPredictModelPost(BigDecimal modelId,String dataFormat,String columnHeader,InputStream inputStreamInputStream,Attachment inputStreamDetail){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response modelsModelIdGet(String modelId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response modelsModelIdPost(String modelId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response modelsModelIdDelete(String modelId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response modelsModelIdExportModelGet(String modelId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response modelsModelIdPredictModelPost(String modelId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response modelsModelIdPublishModelPost(String modelId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response modelsModelIdStoragesPost(String modelId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response modelsModelIdSummaryGet(String modelId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
