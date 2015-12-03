package i1.factories;

import i1.ConfigsApiService;
import i1.impl.ConfigsApiServiceImpl;

public class ConfigsApiServiceFactory {

   private final static ConfigsApiService service = new ConfigsApiServiceImpl();

   public static ConfigsApiService getConfigsApi()
   {
      return service;
   }
}
