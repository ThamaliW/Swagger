package i1.impl;

import i1.*;
import i1.dto.*;



import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;

public class DatasetApiServiceImpl extends DatasetApiService {
    @Override
    public Response datasetVersionsVersionsetIdDelete(Integer versionsetId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response datasetDatasetIdDelete(Integer datasetId){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
