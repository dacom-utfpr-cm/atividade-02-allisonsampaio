package exercicio03;

public class NumerosPrimos implements Runnable {

    private final int begin;
    private final int end;

    public NumerosPrimos(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = this.begin; i < this.end; i++) {
            int aux = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    aux++;
                }
            }
            if (aux == 2) {
                System.out.println("Nº: " + i);
            }
        }
    }

}
