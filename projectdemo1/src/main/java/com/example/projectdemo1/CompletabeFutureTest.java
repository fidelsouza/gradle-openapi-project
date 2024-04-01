package com.example.projectdemo1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletabeFutureTest {

    public static void main(String[] args)
    {
        Order o = new Order();
        Order o2 = new Order();
        Order o3 = new Order();
        Order o4 = new Order();
        Order o5 = new Order();

        try {
            long start = System.currentTimeMillis();
            Future f1 = o.calculateAsync();
            Future f2 = o2.calculateAsync();
            Future f3 = o3.calculateAsync();
            Future f4 = o4.calculateAsync();
            Future f5 = o5.calculateAsync();

            Thread.sleep(1000);

            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
            System.out.println(f5.get());

            long end = System.currentTimeMillis();
            System.out.println("Time: "+ (end-start) +"ms");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }



    static class Order{

        public Future<String> calculateAsync() throws InterruptedException {
            CompletableFuture<String> completableFuture = new CompletableFuture<>();

            Executors.newCachedThreadPool().submit(() -> {
                Thread.sleep(3000);
                completableFuture.complete(String.valueOf(calculateOrder()));
                return null;
            });

            return completableFuture;
        }

        public double calculateOrder(){

           return Math.random()*100;
        }

    }
}
