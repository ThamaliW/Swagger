package i1;

import i1.*;
import i1.dto.*;


import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class AnalysesApiService {
    public abstract Response analysesGet();
    public abstract Response analysesPost();
    public abstract Response analysesAnalysisIdDelete(String analysisId);
    public abstract Response analysesAnalysisIdAlgorithmNameGet(String analysisId);
    public abstract Response analysesAnalysisIdAlgorithmTypeGet(String analysisId);
    public abstract Response analysesAnalysisIdConfigsGet(String analysisId);
    public abstract Response analysesAnalysisIdConfigurationsPost(String analysisId);
    public abstract Response analysesAnalysisIdCustomizedFeaturesGet(String analysisId);
    public abstract Response analysesAnalysisIdFeaturesGet(String analysisId);
    public abstract Response analysesAnalysisIdFeaturesDefaultsGet(String analysisId);
    public abstract Response analysesAnalysisIdFilteredFeaturesfeatureTypefeatureTypeGet(String analysisId,String featureType);
    public abstract Response analysesAnalysisIdHyperParametersGet(String analysisId);
    public abstract Response analysesAnalysisIdHyperParamsPost(String analysisId,String algorithmName);
    public abstract Response analysesAnalysisIdHyperParamsDefaultsPost(String analysisId);
    public abstract Response analysesAnalysisIdModelsGet(String analysisId);
    public abstract Response analysesAnalysisIdResponseVariablesGet(String analysisId);
    public abstract Response analysesAnalysisIdStatsfeaturefeatureNameGet(String analysisId,String featureName);
    public abstract Response analysesAnalysisIdSummarizedFeaturesGet(String analysisId);
    public abstract Response analysesAnalysisIdTrainDataFractionGet(String analysisId);
}

