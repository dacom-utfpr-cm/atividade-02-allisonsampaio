package exercicio01;

public class Consult implements Runnable {

    Thread myThreads[] = new Thread[3];

    @Override
    public void run() {
        try {
            for (int i = 1; i < 3; i++) {

                System.out.println("Thread " + i + " : " + myThreads[i].getState());
                if (i == 2) {
                    i = -1;
                    Thread.sleep(5000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public Consult(Thread myThreads[]) {
        this.myThreads = myThreads;
    }
}
