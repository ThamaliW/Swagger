package i1;

import i1.*;
import i1.dto.*;

import java.io.File;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class DatasetsApiService {
    public abstract Response datasetsGet();
    public abstract Response datasetsPost(String datasetName,String sourceType,String destination,String dataFormat,Boolean containsHeader,String version,String sourcePath,InputStream fileInputStream,Attachment fileDetail,String description);
    public abstract Response datasetsVersionsGet();
    public abstract Response datasetsVersionsVersionsetIdGet(Integer versionsetId);
    public abstract Response datasetsVersionsVersionsetIdChartsfeaturesfeatureListGet(Integer versionsetId,String featureList);
    public abstract Response datasetsVersionsVersionsetIdSamplePointsGet(Integer versionsetId);
    public abstract Response datasetsVersionsVersionsetIdScatterPlotPointsPost(Integer versionsetId);
    public abstract Response datasetsDatasetIdGet(Integer datasetId);
    public abstract Response datasetsDatasetIdChartsGet(Integer datasetId,String features);
    public abstract Response datasetsDatasetIdClusterPointsfeaturesfeatureListnoOfClustersnumberOfClustersGet(Integer datasetId,String featureList,Integer numberOfClusters);
    public abstract Response datasetsDatasetIdFilteredFeaturesfeatureTypefeatureTypeGet(Integer datasetId,String featureType);
    public abstract Response datasetsDatasetIdScatterPlotPointsPost(Integer datasetId);
    public abstract Response datasetsDatasetIdStatsfeaturefeatureNameGet(String datasetId,String featureName);
    public abstract Response datasetsDatasetIdStatusGet(Integer datasetId);
    public abstract Response datasetsDatasetIdVersionsGet(Integer datasetId);
    public abstract Response datasetsDatasetIdVersionsVersionGet(Integer datasetId,String version);
}

