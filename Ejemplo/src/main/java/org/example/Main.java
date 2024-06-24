package org.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ejercicio3();
        ejercicio4();
    }

    private static void ejercicio3() {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(Main::generarNumeroAleatorioYDormir);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(Main::generarNumeroAleatorioYDormir);
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(Main::generarNumeroAleatorioYDormir);
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(Main::generarNumeroAleatorioYDormir);

        CompletableFuture<Void> tareas = CompletableFuture.allOf(future1, future2, future3, future4);

        tareas.thenRun(() -> {
            try {
                int sum = future1.get() + future2.get() + future3.get() + future4.get();
                System.out.println("La suma de los 4 valores es: " + sum);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }).join();
    }

    private static void ejercicio4() {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(Main::generarNumeroAleatorioYDormir);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(Main::generarNumeroAleatorioYDormir);
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(Main::generarNumeroAleatorioYDormir);
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(Main::generarNumeroAleatorioYDormir);

        CompletableFuture<Object> firstCompletedFuture = CompletableFuture.anyOf(future1, future2, future3, future4);

        firstCompletedFuture.thenAccept(result -> {
            System.out.println("El valor del primer futuro completado es: " + result);
        }).join();
    }

    private static int generarNumeroAleatorioYDormir() {
        int randomValue = ThreadLocalRandom.current().nextInt(100, 501);
        try {
            Thread.sleep(randomValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return randomValue;
    }
}