package i1;

import i1.dto.*;
import i1.ConfigsApiService;
import i1.factories.ConfigsApiServiceFactory;

import io.swagger.annotations.ApiParam;


import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/configs")


@io.swagger.annotations.Api(value = "/configs", description = "the configs API")
public class ConfigsApi  {

   private final ConfigsApiService delegate = ConfigsApiServiceFactory.getConfigsApi();

    @GET
    @Path("/algorithms")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Receives a list algorithms", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok") })

    public Response configsAlgorithmsGet()
    {
    return delegate.configsAlgorithmsGet();
    }
    @GET
    @Path("/algorithms/{algorithm-name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves an algorithm", notes = "Retrieves an algorithm via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found") })

    public Response configsAlgorithmsAlgorithmNameGet(@ApiParam(value = "Name of the algorithm which is needed to be retrieved",required=true ) @PathParam("algorithm-name") String algorithmName)
    {
    return delegate.configsAlgorithmsAlgorithmNameGet(algorithmName);
    }
    @GET
    @Path("/algorithms/{algorithm-name}/hyper-params")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves hyper-params", notes = "Retrieves hyper paramethers of an algorithm via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found") })

    public Response configsAlgorithmsAlgorithmNameHyperParamsGet(@ApiParam(value = "Name of the algorithm of which, hyper params should be received",required=true ) @PathParam("algorithm-name") String algorithmName)
    {
    return delegate.configsAlgorithmsAlgorithmNameHyperParamsGet(algorithmName);
    }
    @GET
    @Path("/das-tables")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieve list of DAS table names", notes = "Retrieve a list of DAS tables from wso2 data analytic server(DAS)", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal servar error") })

    public Response configsDasTablesGet()
    {
    return delegate.configsDasTablesGet();
    }
    @GET
    @Path("/summary-stat-settings")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves summary stat settings", notes = "Retrieves summry statistic settingsvia REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response configsSummaryStatSettingsGet()
    {
    return delegate.configsSummaryStatSettingsGet();
    }
}

