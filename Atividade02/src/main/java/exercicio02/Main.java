/*
 * Atividade 02 - Programação com Threads
 * Allison Alfredo de Oliveira Sampaio - 1710621

 * Exercício 02 -
 * Programa para testar um conjunto de operações sobre um grupo de threads usando o ThreadGroup.
 */
package exercicio02;

public class Main {

    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("ThreadGroup");

        Thread t1 = new Thread(group, new ExemploThread(), "thread1");
        Thread t2 = new Thread(group, new ExemploThread(), "thread2");
        Thread t3 = new Thread(group, new ExemploThread(), "thread3");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Threads ativas: " + group.activeCount());
        System.out.println("Grupo: " + group.getName());

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        try {
            group.destroy();
            System.out.println("Grupo destruido");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
