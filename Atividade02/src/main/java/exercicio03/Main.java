/*
 * Atividade 02 - Programação com Threads
 * Allison Alfredo de Oliveira Sampaio - 1710621

 * Exercício 03 -
 * Programa com threads que exibe os números primos entre 0 e 100000.
 */
package exercicio03;

public class Main {

    public static void main(String[] args) {
        new Thread(new NumerosPrimos(0, 100000)).start();
    }
}
