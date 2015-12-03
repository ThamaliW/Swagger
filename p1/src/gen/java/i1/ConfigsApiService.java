package i1;

import i1.*;
import i1.dto.*;


import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class ConfigsApiService {
    public abstract Response configsAlgorithmsGet();
    public abstract Response configsAlgorithmsAlgorithmNameGet(String algorithmName);
    public abstract Response configsAlgorithmsAlgorithmNameHyperParamsGet(String algorithmName);
    public abstract Response configsDasTablesGet();
    public abstract Response configsSummaryStatSettingsGet();
}

