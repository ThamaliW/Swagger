package i1;

import i1.*;
import i1.dto.*;


import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class DatasetApiService {
    public abstract Response datasetVersionsVersionsetIdDelete(Integer versionsetId);
    public abstract Response datasetDatasetIdDelete(Integer datasetId);
}

