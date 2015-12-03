package i1;

import i1.dto.*;
import i1.ProjectsApiService;
import i1.factories.ProjectsApiServiceFactory;

import io.swagger.annotations.ApiParam;


import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/projects")


@io.swagger.annotations.Api(value = "/projects", description = "the projects API")
public class ProjectsApi  {

   private final ProjectsApiService delegate = ProjectsApiServiceFactory.getProjectsApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves projects", notes = "Retrieves all projects  via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response projectsGet()
    {
    return delegate.projectsGet();
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Creates a Project", notes = "Creates a project (with a dataset name) via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response projectsPost()
    {
    return delegate.projectsPost();
    }
    @GET
    @Path("/analyses")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves all analyses", notes = "Retrieves all analyses of all projects via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response projectsAnalysesGet()
    {
    return delegate.projectsAnalysesGet();
    }
    @GET
    @Path("/{project-id}/analyses")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves all analyses", notes = "Retrieves all analyses of a project via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response projectsProjectIdAnalysesGet(@ApiParam(value = "ID of the project of which you need to retrieve analyses",required=true ) @PathParam("project-id") Integer projectId)
    {
    return delegate.projectsProjectIdAnalysesGet(projectId);
    }
    @GET
    @Path("/{project-id}/analyses/{analysis-name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves a analysis of a project", notes = "Retrieves a specific analysis of a project via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response projectsProjectIdAnalysesAnalysisNameGet(@ApiParam(value = "ID of the project of which you need to retrieve the analysis",required=true ) @PathParam("project-id") Integer projectId,
    @ApiParam(value = "name of the analysis of which is needed to be retrieved",required=true ) @PathParam("analysis-name") String analysisName)
    {
    return delegate.projectsProjectIdAnalysesAnalysisNameGet(projectId,analysisName);
    }
    @GET
    @Path("/{project-id}/models")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves model of a project", notes = "Retrieves all models of a project via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response projectsProjectIdModelsGet(@ApiParam(value = "ID of the project of which you need to retrieve models",required=true ) @PathParam("project-id") Integer projectId)
    {
    return delegate.projectsProjectIdModelsGet(projectId);
    }
    @GET
    @Path("/{project-name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Retrieves a project", notes = "Retrieves a project via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response projectsProjectNameGet(@ApiParam(value = "Name of the project of which is needed to be retrieved",required=true ) @PathParam("project-name") String projectName)
    {
    return delegate.projectsProjectNameGet(projectName);
    }
    @DELETE
    @Path("/{project-name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a project", notes = "Deletes  a project via REST API", response = Void.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "ok"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server error") })

    public Response projectsProjectNameDelete(@ApiParam(value = "Name of the project of which is needed to be deleted",required=true ) @PathParam("project-name") String projectName)
    {
    return delegate.projectsProjectNameDelete(projectName);
    }
}

