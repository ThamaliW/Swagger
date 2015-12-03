package i1.impl;

import i1.*;
import i1.dto.*;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import java.io.File;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;

public class DatasetsApiServiceImpl extends DatasetsApiService {
    @Override
    public Response datasetsGet(){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsPost(String datasetName, String sourceType, String destination, String dataFormat, Boolean containsHeader, String version, String sourcePath, InputStream fileInputStream, Attachment fileDetail, String description){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsVersionsGet(){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsVersionsVersionsetIdGet(Integer versionsetId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsVersionsVersionsetIdChartsfeaturesfeatureListGet(Integer versionsetId,String featureList){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsVersionsVersionsetIdSamplePointsGet(Integer versionsetId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsVersionsVersionsetIdScatterPlotPointsPost(Integer versionsetId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsDatasetIdGet(Integer datasetId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsDatasetIdChartsGet(Integer datasetId,String features){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsDatasetIdClusterPointsfeaturesfeatureListnoOfClustersnumberOfClustersGet(Integer datasetId,String featureList,Integer numberOfClusters){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsDatasetIdFilteredFeaturesfeatureTypefeatureTypeGet(Integer datasetId,String featureType){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsDatasetIdScatterPlotPointsPost(Integer datasetId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsDatasetIdStatsfeaturefeatureNameGet(String datasetId,String featureName){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsDatasetIdStatusGet(Integer datasetId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsDatasetIdVersionsGet(Integer datasetId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetsDatasetIdVersionsVersionGet(Integer datasetId,String version){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
