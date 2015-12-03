package i1.impl;

import i1.*;
import i1.dto.*;



import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;

public class AnalysesApiServiceImpl extends AnalysesApiService {
    @Override
    public Response analysesGet(){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesPost(){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdDelete(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdAlgorithmNameGet(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdAlgorithmTypeGet(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdConfigsGet(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdConfigurationsPost(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdCustomizedFeaturesGet(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdFeaturesGet(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdFeaturesDefaultsGet(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdFilteredFeaturesfeatureTypefeatureTypeGet(String analysisId,String featureType){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdHyperParametersGet(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdHyperParamsPost(String analysisId,String algorithmName){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdHyperParamsDefaultsPost(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdModelsGet(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdResponseVariablesGet(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdStatsfeaturefeatureNameGet(String analysisId,String featureName){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdSummarizedFeaturesGet(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analysesAnalysisIdTrainDataFractionGet(String analysisId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
