package i1;

import i1.dto.*;
import i1.ModelsApiService;
import i1.factories.ModelsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import java.io.File;
import java.math.BigDecimal;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/models")


@io.swagger.annotations.Api(value = "/models", description = "the models API")
public class ModelsApi  {

   private final ModelsApiService delegate = ModelsApiServiceFactory.getModelsApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves models", notes = "Retrieves all models via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response modelsGet()
    {
    return delegate.modelsGet();
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Creates model", notes = "Creates a model via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response modelsPost()
    {
    return delegate.modelsPost();
    }
    @POST
    @Path("/predict-model")
    
    
    @io.swagger.annotations.ApiOperation(value = "Makes a prediction", notes = "makes a prediction using a model via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response modelsPredictModelPost(@ApiParam(value = "Unique ID of the model", required=true )@Multipart(value = "modelId")  BigDecimal modelId,
    @ApiParam(value = "Data format of the file (CSV or TSV)", required=true )@Multipart(value = "dataFormat")  String dataFormat,
    @ApiParam(value = "File input stream generated from the file used for predictions") @Multipart(value = "inputStream", required = false) InputStream inputStreamInputStream,
    @ApiParam(value = "File input stream generated from the file used for predictions : details") @Multipart(value = "inputStream" , required = false) Attachment inputStreamDetail)
    {
    return delegate.modelsPredictModelPost(modelId,dataFormat,inputStreamInputStream,inputStreamDetail);
    }
    @POST
    @Path("/stream-predict-model")
    
    
    @io.swagger.annotations.ApiOperation(value = "Predicts using CSV/TSV files", notes = "Makes prediction using a CSV/TSV file via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response modelsStreamPredictModelPost(@ApiParam(value = "Unique ID of the model", required=true )@Multipart(value = "modelId")  BigDecimal modelId,
    @ApiParam(value = "Data format of the file (CSV or TSV)", required=true )@Multipart(value = "dataFormat")  String dataFormat,
    @ApiParam(value = "Whether the file contains the column header as the first row (YES or NO)" )@Multipart(value = "columnHeader", required = false)  String columnHeader,
    @ApiParam(value = "Input stream generated from the file used for predictions") @Multipart(value = "inputStream", required = false) InputStream inputStreamInputStream,
    @ApiParam(value = "Input stream generated from the file used for predictions : details") @Multipart(value = "inputStream" , required = false) Attachment inputStreamDetail)
    {
    return delegate.modelsStreamPredictModelPost(modelId,dataFormat,columnHeader,inputStreamInputStream,inputStreamDetail);
    }
    @GET
    @Path("/{model-id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves model", notes = "Retrieves a model via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response modelsModelIdGet(@ApiParam(value = "Unique name of the model",required=true ) @PathParam("model-id") String modelId)
    {
    return delegate.modelsModelIdGet(modelId);
    }
    @POST
    @Path("/{model-id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Builds model", notes = "Builds a  model via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response modelsModelIdPost(@ApiParam(value = "ID of the model you want to build",required=true ) @PathParam("model-id") String modelId)
    {
    return delegate.modelsModelIdPost(modelId);
    }
    @DELETE
    @Path("/{model-id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a model", notes = "Deletes a model via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response modelsModelIdDelete(@ApiParam(value = "Unique ID of the model",required=true ) @PathParam("model-id") String modelId)
    {
    return delegate.modelsModelIdDelete(modelId);
    }
    @GET
    @Path("/{model-id}/export-model")
    
    
    @io.swagger.annotations.ApiOperation(value = "Exports model", notes = "Exorts a  model via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response modelsModelIdExportModelGet(@ApiParam(value = "ID of the model of which you need to retrieve the summary",required=true ) @PathParam("model-id") String modelId)
    {
    return delegate.modelsModelIdExportModelGet(modelId);
    }
    @POST
    @Path("/{model-id}/predict-model")
    
    
    @io.swagger.annotations.ApiOperation(value = "Predicts a model", notes = "Predicts a model via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response modelsModelIdPredictModelPost(@ApiParam(value = "Unique ID of the model",required=true ) @PathParam("model-id") String modelId)
    {
    return delegate.modelsModelIdPredictModelPost(modelId);
    }
    @POST
    @Path("/{model-id}/publish-model")
    
    
    @io.swagger.annotations.ApiOperation(value = "Publishes a model", notes = "Publishes a model via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response modelsModelIdPublishModelPost(@ApiParam(value = "ID of the model which you need to publish to WSO2 registry",required=true ) @PathParam("model-id") String modelId)
    {
    return delegate.modelsModelIdPublishModelPost(modelId);
    }
    @POST
    @Path("/{model-id}/storages")
    
    
    @io.swagger.annotations.ApiOperation(value = "Adds model storage information", notes = "Adds model storage information of a model via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response modelsModelIdStoragesPost(@ApiParam(value = "of the model to which, you need to add storage information.",required=true ) @PathParam("model-id") String modelId)
    {
    return delegate.modelsModelIdStoragesPost(modelId);
    }
    @GET
    @Path("/{model-id}/summary")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves model summary", notes = "Retrieves summary of a model via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response modelsModelIdSummaryGet(@ApiParam(value = "D of the model of which you need to retrieve the summary",required=true ) @PathParam("model-id") String modelId)
    {
    return delegate.modelsModelIdSummaryGet(modelId);
    }
}

