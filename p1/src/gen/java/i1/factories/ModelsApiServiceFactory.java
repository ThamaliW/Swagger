package i1.factories;

import i1.ModelsApiService;
import i1.impl.ModelsApiServiceImpl;

public class ModelsApiServiceFactory {

   private final static ModelsApiService service = new ModelsApiServiceImpl();

   public static ModelsApiService getModelsApi()
   {
      return service;
   }
}
