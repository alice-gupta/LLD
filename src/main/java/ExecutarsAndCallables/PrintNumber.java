package ExecutarsAndCallables;

public class PrintNumber implements Runnable {
    int noToPrint;
    public PrintNumber(int noToPrint) {
        this.noToPrint = noToPrint;
    }

    @Override
    public void run() {
        System.out.println(noToPrint+" "+Thread.currentThread().getName());
    }
}
