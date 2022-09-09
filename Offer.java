import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Offer {
    public static void main(String[] args) {
        boolean value;

        int capacidade = 10;
        Queue queue = new ArrayBlockingQueue(capacidade);

        double beginTime = System.currentTimeMillis();
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        double finalTime = System.currentTimeMillis();
        
        System.out.println("Executada 10 vezes:");
        System.out.println(finalTime - beginTime);

        capacidade = 100;
        queue = new ArrayBlockingQueue(capacidade);
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        finalTime = System.currentTimeMillis();
        
        System.out.println("\n\nExecutada 100 vezes:");
        System.out.println(finalTime - beginTime);

        capacidade = 1000;
        queue = new ArrayBlockingQueue(capacidade);
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        finalTime = System.currentTimeMillis();
        
        System.out.println("\n\nExecutada 1000 vezes:");
        System.out.println(finalTime - beginTime);

        capacidade = 10000;
        queue = new ArrayBlockingQueue(capacidade);
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        finalTime = System.currentTimeMillis();
        
        System.out.println("\n\nExecutada 10000 vezes:");
        System.out.println(finalTime - beginTime);

        capacidade = 50000;
        queue = new ArrayBlockingQueue(capacidade);
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        finalTime = System.currentTimeMillis();
        
        System.out.println("\n\nExecutada 50000 vezes:");
        System.out.println(finalTime - beginTime);

        capacidade = 100000;
        queue = new ArrayBlockingQueue(capacidade);
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        finalTime = System.currentTimeMillis();
        
        System.out.println("\n\nExecutando 100000 vezes:");
        System.out.println(finalTime - beginTime);
/*
 * Implementation note: this implementation provides O(log(n)) time for the 
 * enqueuing and dequeuing methods (offer, poll, remove() and add); 
 * linear time for the remove(Object) and contains(Object) methods; and constant time
 * for the retrieval methods (peek, element, and size).
 * 
 * Testes para a contagem de tempo foram feitos aumentando a quantidade de chamadas do método Offer()
 * 
 * Unidade de Medida de Tempo: milisegundos
 * Runed in a MacBook Pro with M1 Chip
 */
    }
}