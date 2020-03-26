package exercicio02;

public class ExemploThread implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Inicio");
            Thread.sleep((long) (Math.random() * 50000));
            System.out.println("Fim");
        } catch (InterruptedException ex) {
            System.out.println("Interupt");
            Thread.currentThread().interrupt();
        }
    }
}
