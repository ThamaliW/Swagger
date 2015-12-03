package i1.factories;

import i1.DatasetApiService;
import i1.impl.DatasetApiServiceImpl;

public class DatasetApiServiceFactory {

   private final static DatasetApiService service = new DatasetApiServiceImpl();

   public static DatasetApiService getDatasetApi()
   {
      return service;
   }
}
