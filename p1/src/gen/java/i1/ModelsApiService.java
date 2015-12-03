package i1;

import i1.*;
import i1.dto.*;

import java.io.File;
import java.math.BigDecimal;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class ModelsApiService {
    public abstract Response modelsGet();
    public abstract Response modelsPost();
    public abstract Response modelsPredictModelPost(BigDecimal modelId,String dataFormat,InputStream inputStreamInputStream,Attachment inputStreamDetail);
    public abstract Response modelsStreamPredictModelPost(BigDecimal modelId,String dataFormat,String columnHeader,InputStream inputStreamInputStream,Attachment inputStreamDetail);
    public abstract Response modelsModelIdGet(String modelId);
    public abstract Response modelsModelIdPost(String modelId);
    public abstract Response modelsModelIdDelete(String modelId);
    public abstract Response modelsModelIdExportModelGet(String modelId);
    public abstract Response modelsModelIdPredictModelPost(String modelId);
    public abstract Response modelsModelIdPublishModelPost(String modelId);
    public abstract Response modelsModelIdStoragesPost(String modelId);
    public abstract Response modelsModelIdSummaryGet(String modelId);
}

