package i1;

import i1.dto.*;
import i1.AnalysesApiService;
import i1.factories.AnalysesApiServiceFactory;

import io.swagger.annotations.ApiParam;


import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/analyses")


@io.swagger.annotations.Api(value = "/analyses", description = "the analyses API")
public class AnalysesApi  {

   private final AnalysesApiService delegate = AnalysesApiServiceFactory.getAnalysesApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Retrieves all analyses via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesGet()
    {
    return delegate.analysesGet();
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Creating an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesPost()
    {
    return delegate.analysesPost();
    }
    @DELETE
    @Path("/{analysis-id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes an analysis", notes = "deletes an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdDelete(@ApiParam(value = "ID of the analysis of which you need to delete",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdDelete(analysisId);
    }
    @GET
    @Path("/{analysis-id}/algorithm-name")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves algorithm name", notes = "Retrieves algorithm name of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdAlgorithmNameGet(@ApiParam(value = "ID of the analysis of which the algorithm name needed to be retrieved",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdAlgorithmNameGet(analysisId);
    }
    @GET
    @Path("/{analysis-id}/algorithm-type")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves algorithm type", notes = "Retrieves algorithm type of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdAlgorithmTypeGet(@ApiParam(value = "ID of the analysis of which the algorithm type is needed to be retrieved",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdAlgorithmTypeGet(analysisId);
    }
    @GET
    @Path("/{analysis-id}/configs")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves configurations", notes = "Retrieves configurations of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdConfigsGet(@ApiParam(value = "ID of the analysis of which you need to retrieve configurations",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdConfigsGet(analysisId);
    }
    @POST
    @Path("/{analysis-id}/configurations")
    
    
    @io.swagger.annotations.ApiOperation(value = "Sets configurations", notes = "Sets configurations of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdConfigurationsPost(@ApiParam(value = "ID of the analysis of wwhich the configurations are needed to be set",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdConfigurationsPost(analysisId);
    }
    @GET
    @Path("/{analysis-id}/customized-features")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves customized features", notes = "Retrieves customized features of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdCustomizedFeaturesGet(@ApiParam(value = "ID of the analysis of which you need to retrieve customized features",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdCustomizedFeaturesGet(analysisId);
    }
    @GET
    @Path("/{analysis-id}/features")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves features", notes = "Retrieves features of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdFeaturesGet(@ApiParam(value = "ID of the analysis of which the features are needed to be retrieved",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdFeaturesGet(analysisId);
    }
    @GET
    @Path("/{analysis-id}/features/defaults")
    
    
    @io.swagger.annotations.ApiOperation(value = "Sets customized features", notes = "Sets default features as customized features of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdFeaturesDefaultsGet(@ApiParam(value = "ID of the analysis to which, you need to load the default features as customized features",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdFeaturesDefaultsGet(analysisId);
    }
    @GET
    @Path("/{analysis-id}/filtered-features?featureType={feature-type}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves filtered features", notes = "Retrieves filtered features of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdFilteredFeaturesfeatureTypefeatureTypeGet(@ApiParam(value = "ID of the analysis of which the filtered features are needed to be retrieved",required=true ) @PathParam("analysis-id") String analysisId,
    @ApiParam(value = "feature type which is needed to be retrieved",required=true ) @PathParam("feature-type") String featureType)
    {
    return delegate.analysesAnalysisIdFilteredFeaturesfeatureTypefeatureTypeGet(analysisId,featureType);
    }
    @GET
    @Path("/{analysis-id}/hyper-parameters")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves  hyper parameters of an analysis", notes = "Retrievess hyper parameters of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdHyperParametersGet(@ApiParam(value = "ID of the analysis of which you need to retrieve hyper parameters",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdHyperParametersGet(analysisId);
    }
    @POST
    @Path("/{analysis-id}/hyper-params")
    
    
    @io.swagger.annotations.ApiOperation(value = "Sets hyper parameters of an algorithm", notes = "Sets hyper parameters of a selected algorithm via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdHyperParamsPost(@ApiParam(value = "ID of the analysis to which, you need to set hyper parameters for the selected algorithm",required=true ) @PathParam("analysis-id") String analysisId,
    @ApiParam(value = "Name of the learning algorithm on which analysis is created",required=true) @QueryParam("algorithm-name") String algorithmName)
    {
    return delegate.analysesAnalysisIdHyperParamsPost(analysisId,algorithmName);
    }
    @POST
    @Path("/{analysis-id}/hyper-params/defaults")
    
    
    @io.swagger.annotations.ApiOperation(value = "Loads default hyper parametrs of an analysis", notes = "Loads default hyper parameters for an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdHyperParamsDefaultsPost(@ApiParam(value = "ID of the analysis to which, you need to load hyper parameters",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdHyperParamsDefaultsPost(analysisId);
    }
    @GET
    @Path("/{analysis-id}/models")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves all models of an analysis", notes = "Retrieves all models of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdModelsGet(@ApiParam(value = "ID of the analysis of which you need to retrieve all models",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdModelsGet(analysisId);
    }
    @GET
    @Path("/{analysis-id}/response-variables")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves filtered features", notes = "Retrieves response variables of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdResponseVariablesGet(@ApiParam(value = "ID of the analysis of which the response variables are needed to be retrieved",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdResponseVariablesGet(analysisId);
    }
    @GET
    @Path("/{analysis-id}/stats?feature={feature-name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves summarized statistics", notes = "Retrieves sumarized statistics of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdStatsfeaturefeatureNameGet(@ApiParam(value = "ID of the analysis of which summarized statistics is needed to be retrieved",required=true ) @PathParam("analysis-id") String analysisId,
    @ApiParam(value = "Name of the feature which you need to retrieve summarized statistics",required=true ) @PathParam("feature-name") String featureName)
    {
    return delegate.analysesAnalysisIdStatsfeaturefeatureNameGet(analysisId,featureName);
    }
    @GET
    @Path("/{analysis-id}/summarized-features")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves summarized features", notes = "Retrieves summarized features of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdSummarizedFeaturesGet(@ApiParam(value = "ID of the analysis of which summarized features needed to be retrieved",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdSummarizedFeaturesGet(analysisId);
    }
    @GET
    @Path("/{analysis-id}/train-data-fraction")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves train data fraction", notes = "Retrieves train data fraction of an analysis via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response analysesAnalysisIdTrainDataFractionGet(@ApiParam(value = "ID of the analysis of which the train data fraction is needed to be retrieved",required=true ) @PathParam("analysis-id") String analysisId)
    {
    return delegate.analysesAnalysisIdTrainDataFractionGet(analysisId);
    }
}

