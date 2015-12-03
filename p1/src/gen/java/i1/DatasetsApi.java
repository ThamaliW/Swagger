package i1;

import i1.dto.*;
import i1.DatasetsApiService;
import i1.factories.DatasetsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import java.io.File;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/datasets")


@io.swagger.annotations.Api(value = "/datasets", description = "the datasets API")
public class DatasetsApi  {

   private final DatasetsApiService delegate = DatasetsApiServiceFactory.getDatasetsApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves all datasets", notes = "Retrieves all datasets via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsGet()
    {
    return delegate.datasetsGet();
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Uploads a dataset", notes = "Uploads a dataset via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error") })

    public Response datasetsPost(@ApiParam(value = "A unique name for the dataset", required=true )@Multipart(value = "datasetName")  String datasetName,
    @ApiParam(value = "Storage type of the source of the dataset (file/HDFS/WSO2 DAS)", required=true )@Multipart(value = "sourceType")  String sourceType,
    @ApiParam(value = "Storage type of the server side copy of the dataset (file/HDFS)", required=true )@Multipart(value = "destination")  String destination,
    @ApiParam(value = "Format of the dataset (CSV/TSV)", required=true )@Multipart(value = "dataFormat")  String dataFormat,
    @ApiParam(value = "Whether the dataset contains a header row or not", required=true )@Multipart(value = "containsHeader")  Boolean containsHeader,
    @ApiParam(value = "Version of the dataset", required=true )@Multipart(value = "version")  String version,
    @ApiParam(value = "Format depends on the source-type" )@Multipart(value = "sourcePath", required = false)  String sourcePath,
    @ApiParam(value = "Path to dataset file, if source type is file") @Multipart(value = "file", required = false) InputStream fileInputStream,
    @ApiParam(value = "Path to dataset file, if source type is file : details") @Multipart(value = "file" , required = false) Attachment fileDetail,
    @ApiParam(value = "Description about the dataset." )@Multipart(value = "description", required = false)  String description)
    {
    return delegate.datasetsPost(datasetName,sourceType,destination,dataFormat,containsHeader,version,sourcePath,fileInputStream,fileDetail,description);
    }
    @GET
    @Path("/versions")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves all datasets and their versions", notes = "Retrieves all datasets and their versions for a given user via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsVersionsGet()
    {
    return delegate.datasetsVersionsGet();
    }
    @GET
    @Path("/versions/{versionset-id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves a datset version", notes = "Retrieves a dataset version via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsVersionsVersionsetIdGet(@ApiParam(value = "ID of the version set which is needed to be retrieved",required=true ) @PathParam("versionset-id") Integer versionsetId)
    {
    return delegate.datasetsVersionsVersionsetIdGet(versionsetId);
    }
    @GET
    @Path("/versions/{versionset-id}/charts?features={feature-list}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves chart sample points of a dataset version", notes = "Retrieves chart sample points of a given data set version for a feature list.", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsVersionsVersionsetIdChartsfeaturesfeatureListGet(@ApiParam(value = "ID of the version set which you need to retrieve chart sample points",required=true ) @PathParam("versionset-id") Integer versionsetId,
    @ApiParam(value = "comma seperated feature list",required=true ) @PathParam("feature-list") String featureList)
    {
    return delegate.datasetsVersionsVersionsetIdChartsfeaturesfeatureListGet(versionsetId,featureList);
    }
    @GET
    @Path("/versions/{versionset-id}/sample-points")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves sample points", notes = "Retrieves sample points of a given dataset version", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsVersionsVersionsetIdSamplePointsGet(@ApiParam(value = "ID of the version set of which you need to retrieve sample points",required=true ) @PathParam("versionset-id") Integer versionsetId)
    {
    return delegate.datasetsVersionsVersionsetIdSamplePointsGet(versionsetId);
    }
    @POST
    @Path("/versions/{versionset-id}/scatter-plot-points")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves scatter plot points", notes = "Retrieves scatter plot points of a dataset version", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsVersionsVersionsetIdScatterPlotPointsPost(@ApiParam(value = "ID of the version set which you neeed to retrieve scatter plot points",required=true ) @PathParam("versionset-id") Integer versionsetId)
    {
    return delegate.datasetsVersionsVersionsetIdScatterPlotPointsPost(versionsetId);
    }
    @GET
    @Path("/{dataset-id}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves a dataset", notes = "Retrieves a dataset of a given dataset id via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsDatasetIdGet(@ApiParam(value = "ID of the dataset which is needed to be retrieved",required=true ) @PathParam("dataset-id") Integer datasetId)
    {
    return delegate.datasetsDatasetIdGet(datasetId);
    }
    @GET
    @Path("/{dataset-id}/charts")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves chart sample points", notes = "Retrieves chart sample points of the latest dataset version via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsDatasetIdChartsGet(@ApiParam(value = "ID of the dataset of which you need to retrieve chart sample points",required=true ) @PathParam("dataset-id") Integer datasetId,
    @ApiParam(value = "comma seperated feature list",required=true) @QueryParam("features") String features)
    {
    return delegate.datasetsDatasetIdChartsGet(datasetId,features);
    }
    @GET
    @Path("/{dataset-id}/cluster-points?features={feature-list}&amp;no-of-clusters={number-of-clusters}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves cluster points of  a data set", notes = "Retrieves cluster points of a dataset for a feature list via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server Error") })

    public Response datasetsDatasetIdClusterPointsfeaturesfeatureListnoOfClustersnumberOfClustersGet(@ApiParam(value = "ID of the dataset which you need to retrieve cluster points",required=true ) @PathParam("dataset-id") Integer datasetId,
    @ApiParam(value = "Feature list of the data set",required=true ) @PathParam("feature-list") String featureList,
    @ApiParam(value = "number of clusters of the output",required=true ) @PathParam("number-of-clusters") Integer numberOfClusters)
    {
    return delegate.datasetsDatasetIdClusterPointsfeaturesfeatureListnoOfClustersnumberOfClustersGet(datasetId,featureList,numberOfClusters);
    }
    @GET
    @Path("/{dataset-id}/filtered-features?feature-type={feature-type}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves filtered features", notes = "Retrieves filtered feature names of a dataset", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsDatasetIdFilteredFeaturesfeatureTypefeatureTypeGet(@ApiParam(value = "ID of the dataset which you need to retrieve filtered feature names",required=true ) @PathParam("dataset-id") Integer datasetId,
    @ApiParam(value = "Feature type which you need to retrieve (CATEGORICAL or NUMERICAL)",required=true ) @PathParam("feature-type") String featureType)
    {
    return delegate.datasetsDatasetIdFilteredFeaturesfeatureTypefeatureTypeGet(datasetId,featureType);
    }
    @POST
    @Path("/{dataset-id}/scatter-plot-points")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves scatter plot points", notes = "Retrieves scatter plot points of the latest dataset version via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsDatasetIdScatterPlotPointsPost(@ApiParam(value = "ID of the data set which is needed to be retrieved",required=true ) @PathParam("dataset-id") Integer datasetId)
    {
    return delegate.datasetsDatasetIdScatterPlotPointsPost(datasetId);
    }
    @GET
    @Path("/{dataset-id}/stats?feature={feature-name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Retrieves summarized statistics of a feature in a dataset", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsDatasetIdStatsfeaturefeatureNameGet(@ApiParam(value = "ID of the dataset of which you need to retrieve summarized statistics of a feature",required=true ) @PathParam("dataset-id") String datasetId,
    @ApiParam(value = "Name of the feature which you need to retrieve summarized statistics",required=true ) @PathParam("feature-name") String featureName)
    {
    return delegate.datasetsDatasetIdStatsfeaturefeatureNameGet(datasetId,featureName);
    }
    @GET
    @Path("/{dataset-id}/status")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves status of dataset", notes = "Retrieves dataset status of a given dataset via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsDatasetIdStatusGet(@ApiParam(value = "ID of the dataset which is needed to be retrieved",required=true ) @PathParam("dataset-id") Integer datasetId)
    {
    return delegate.datasetsDatasetIdStatusGet(datasetId);
    }
    @GET
    @Path("/{dataset-id}/versions")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves versions of a dataset", notes = "Retrieves all version sets  of a dataset via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsDatasetIdVersionsGet(@ApiParam(value = "ID of the dataset which is needed to be retrieved",required=true ) @PathParam("dataset-id") Integer datasetId)
    {
    return delegate.datasetsDatasetIdVersionsGet(datasetId);
    }
    @GET
    @Path("/{dataset-id}/versions/{version}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves version set ID", notes = "Retrieves vetsion set ID of a given dataset version", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response datasetsDatasetIdVersionsVersionGet(@ApiParam(value = "ID of the dataset which is needed to be retrieved",required=true ) @PathParam("dataset-id") Integer datasetId,
    @ApiParam(value = "version of the dataset which is needed to be retrieved",required=true ) @PathParam("version") String version)
    {
    return delegate.datasetsDatasetIdVersionsVersionGet(datasetId,version);
    }
}

