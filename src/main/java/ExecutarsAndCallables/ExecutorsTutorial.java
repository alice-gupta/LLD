package ExecutarsAndCallables;

//java executor framework is used to run the runnable object without creating new threads everytime and reusing the already created thread
//The java.util.concurrent.Executors provide factory methods that are being used to create ThreadPools of worker threads.
// Thread pools overcome this issue by keeping the threads alive and reusing the threads.
//if any excess task is there it will go to the queue and then once the task in threadpool gets completed next task will be picked from queue
//1 cpu-> many threads,1 thread->many tasks

import java.util.concurrent.*;

public class ExecutorsTutorial {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(10);
        for(int i=1;i<100;i++){
            if(i==80){
                System.out.println("something");
            }
            PrintNumber task=new PrintNumber(i);
            ex.execute(task);
        }

        }
    }
//ExecutorService creates the thread behind the scene and assign the task accordingly so the CPU would not become slow
//Executors service 2 methods:
//1.newCachedThreadPool()->no of threads are not fixed and new threads are only getting created when it will be required if no existing thread available then only it will create new threads
//2.newFixedThreadPool()->No of threads are fixed and all the tasks are assigned to them(preferred for longer tasks)
