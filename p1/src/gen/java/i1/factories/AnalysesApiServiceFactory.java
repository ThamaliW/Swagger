package i1.factories;

import i1.AnalysesApiService;
import i1.impl.AnalysesApiServiceImpl;

public class AnalysesApiServiceFactory {

   private final static AnalysesApiService service = new AnalysesApiServiceImpl();

   public static AnalysesApiService getAnalysesApi()
   {
      return service;
   }
}
