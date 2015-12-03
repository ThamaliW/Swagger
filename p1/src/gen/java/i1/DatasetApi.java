package i1;

import i1.dto.*;
import i1.DatasetApiService;
import i1.factories.DatasetApiServiceFactory;

import io.swagger.annotations.ApiParam;


import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/dataset")


@io.swagger.annotations.Api(value = "/dataset", description = "the dataset API")
public class DatasetApi  {

   private final DatasetApiService delegate = DatasetApiServiceFactory.getDatasetApi();

    @DELETE
    @Path("/versions/{versionset-id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a  data set version", notes = "Delete a dataset version of a given dataset ID via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetVersionsVersionsetIdDelete(@ApiParam(value = "ID of the version set which is needed to be deleted",required=true ) @PathParam("versionset-id") Integer versionsetId)
    {
    return delegate.datasetVersionsVersionsetIdDelete(versionsetId);
    }
    @DELETE
    @Path("/{dataset-id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a data set", notes = "Deletes a dataset via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetDatasetIdDelete(@ApiParam(value = "ID of the dataset which you need to retrieve filtered feature names",required=true ) @PathParam("dataset-id") Integer datasetId)
    {
    return delegate.datasetDatasetIdDelete(datasetId);
    }
}

