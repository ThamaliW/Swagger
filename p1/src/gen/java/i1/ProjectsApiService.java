package i1;

import i1.*;
import i1.dto.*;


import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class ProjectsApiService {
    public abstract Response projectsGet();
    public abstract Response projectsPost();
    public abstract Response projectsAnalysesGet();
    public abstract Response projectsProjectIdAnalysesGet(Integer projectId);
    public abstract Response projectsProjectIdAnalysesAnalysisNameGet(Integer projectId,String analysisName);
    public abstract Response projectsProjectIdModelsGet(Integer projectId);
    public abstract Response projectsProjectNameGet(String projectName);
    public abstract Response projectsProjectNameDelete(String projectName);
}

