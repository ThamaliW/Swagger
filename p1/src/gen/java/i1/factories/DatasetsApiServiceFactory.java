package i1.factories;

import i1.DatasetsApiService;
import i1.impl.DatasetsApiServiceImpl;

public class DatasetsApiServiceFactory {

   private final static DatasetsApiService service = new DatasetsApiServiceImpl();

   public static DatasetsApiService getDatasetsApi()
   {
      return service;
   }
}
