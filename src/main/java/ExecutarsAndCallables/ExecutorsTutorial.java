package ExecutarsAndCallables;

//java executor framework is used to run the runnable object without creating new threads everytime and reusing the already created thread
//The java.util.concurrent.Executors provide factory methods that are being used to create ThreadPools of worker threads.
// Thread pools overcome this issue by keeping the threads alive and reusing the threads.
//if any excess task is there it will go to the queue and then once the task in threadpool gets completed next task will be picked from queue
//1 cpu-> many threads,1 thread->many tasks

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorsTutorial {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(10);
        for(int i=1;i<10000000;i++){
            PrintNumber task=new PrintNumber(i);
            ex.execute(task);
        }

        }
    }
