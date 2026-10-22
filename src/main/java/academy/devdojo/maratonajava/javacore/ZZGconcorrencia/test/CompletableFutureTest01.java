package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        //searchPricesSync(storeService);
        //searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end-start));
    }

    private static void searchPricesAsyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        Future<Double> pricesAyscnFuture1 = storeService.getPricesAyscnFuture("Store 1");
        Future<Double> pricesAyscnFuture2 = storeService.getPricesAyscnFuture("Store 2");
        Future<Double> pricesAyscnFuture3 = storeService.getPricesAyscnFuture("Store 3");
        Future<Double> pricesAyscnFuture4 = storeService.getPricesAyscnFuture("Store 4");
        try {
            System.out.println(pricesAyscnFuture1.get());
            System.out.println(pricesAyscnFuture2.get());
            System.out.println(pricesAyscnFuture3.get());
            System.out.println(pricesAyscnFuture4.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end-start));
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAyscnFuture1 = storeService.getPricesAyscnCompletableFuture("Store 1");
        CompletableFuture<Double> pricesAyscnFuture2 = storeService.getPricesAyscnCompletableFuture("Store 2");
        CompletableFuture<Double> pricesAyscnFuture3 = storeService.getPricesAyscnCompletableFuture("Store 3");
        CompletableFuture<Double> pricesAyscnFuture4 = storeService.getPricesAyscnCompletableFuture("Store 4");

        System.out.println(pricesAyscnFuture1.join());
        System.out.println(pricesAyscnFuture2.join());
        System.out.println(pricesAyscnFuture3.join());
        System.out.println(pricesAyscnFuture4.join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end-start));
    }
}
