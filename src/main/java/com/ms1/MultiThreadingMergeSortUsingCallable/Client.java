package com.ms1.MultiThreadingMergeSortUsingCallable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(8  , 1 ,2 , 9 , 6 , 3 , 7, 5);
        // sort this list

        ExecutorService ex= Executors.newCachedThreadPool();
        Sorter arraySorter= new Sorter(list,ex);
        Future<List<Integer>> result= ex.submit(arraySorter);

        List<Integer> resultList= result.get();
        System.out.println(resultList);

    }
}
