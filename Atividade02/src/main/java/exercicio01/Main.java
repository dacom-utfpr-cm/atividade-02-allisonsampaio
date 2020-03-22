/*
 * Atividade 02 - Programação com Threads
 * Allison Alfredo de Oliveira Sampaio - 1710621

 * Exercício 01 -
 * Programa em Java que consulta periodicamente o estado de um conjunto de threads
 */
package exercicio01;

public class Main {

    public static void main(String[] args) {
        Thread myThreads[] = new Thread[3];

        for (int i = 0; i < 3; i++) {
            myThreads[i] = new Thread(new ExemploThread());
            myThreads[i].start();
        }

        new Thread(new Consult(myThreads)).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
