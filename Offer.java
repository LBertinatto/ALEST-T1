import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Offer {
    public static void main(String[] args) {
        boolean value;

        int capacidade = 1000;
        Queue queue = new ArrayBlockingQueue(capacidade);

        double beginTime = System.currentTimeMillis();
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        
        double finalTime = System.currentTimeMillis();
        
        System.out.println("Operação executada " + capacidade + " vezes::");
        System.out.println(finalTime - beginTime);

        ////////////////////////////////////////////////////////////

        capacidade = 50000;
        queue = new ArrayBlockingQueue(capacidade);

        beginTime = System.currentTimeMillis();
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        
        finalTime = System.currentTimeMillis();
        
        System.out.println("Operação executada " + capacidade + " vezes::");
        System.out.println(finalTime - beginTime);

        ////////////////////////////////////////////////////////////

        capacidade = 100000;
        queue = new ArrayBlockingQueue(capacidade);

        beginTime = System.currentTimeMillis();
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        
        finalTime = System.currentTimeMillis();
        
        System.out.println("Operação executada " + capacidade + " vezes::");
        System.out.println(finalTime - beginTime);

        ////////////////////////////////////////////////////////////

        capacidade = 175000;
        queue = new ArrayBlockingQueue(capacidade);

        beginTime = System.currentTimeMillis();
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        
        finalTime = System.currentTimeMillis();
        
        System.out.println("Operação executada " + capacidade + " vezes::");
        System.out.println(finalTime - beginTime);

        ////////////////////////////////////////////////////////////

        capacidade = 250000;
        queue = new ArrayBlockingQueue(capacidade);

        beginTime = System.currentTimeMillis();
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        
        finalTime = System.currentTimeMillis();
        
        System.out.println("Operação executada " + capacidade + " vezes::");
        System.out.println(finalTime - beginTime);

        ////////////////////////////////////////////////////////////

        capacidade = 375000;
        queue = new ArrayBlockingQueue(capacidade);

        beginTime = System.currentTimeMillis();
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        
        finalTime = System.currentTimeMillis();
        
        System.out.println("Operação executada " + capacidade + " vezes::");
        System.out.println(finalTime - beginTime);

        ////////////////////////////////////////////////////////////

        capacidade = 500000;
        queue = new ArrayBlockingQueue(capacidade);

        beginTime = System.currentTimeMillis();
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        
        finalTime = System.currentTimeMillis();
        
        System.out.println("Operação executada " + capacidade + " vezes::");
        System.out.println(finalTime - beginTime);

        ////////////////////////////////////////////////////////////

        capacidade = 600000;
        queue = new ArrayBlockingQueue(capacidade);

        beginTime = System.currentTimeMillis();
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        
        finalTime = System.currentTimeMillis();
        
        System.out.println("Operação executada " + capacidade + " vezes::");
        System.out.println(finalTime - beginTime);

        ////////////////////////////////////////////////////////////
/*
 * Implementation note: this implementation provides O(log(n)) time for the 
 * enqueuing and dequeuing methods (offer, poll, remove() and add); 
 * linear time for the remove(Object) and contains(Object) methods; and constant time
 * for the retrieval methods (peek, element, and size).
 * 
 * Testes para a contagem de tempo foram feitos aumentando a quantidade de chamadas do método Offer()
 * 
 * Unidade de Medida de Tempo: milissegundos
 * Runed in a MacBook Pro with M1 Chip
 */
    }
}