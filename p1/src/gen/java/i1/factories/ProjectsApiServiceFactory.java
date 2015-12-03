package i1.factories;

import i1.ProjectsApiService;
import i1.impl.ProjectsApiServiceImpl;

public class ProjectsApiServiceFactory {

   private final static ProjectsApiService service = new ProjectsApiServiceImpl();

   public static ProjectsApiService getProjectsApi()
   {
      return service;
   }
}
