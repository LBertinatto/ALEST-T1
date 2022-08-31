import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Offer {
    public static void main(String[] args) {
        int capacidade = 13;
        Queue queue = new ArrayBlockingQueue(capacidade);
        boolean value = false;
        
        for(int i = 1; i < capacidade+1; i++ ){
            value = queue.offer(i);
        }
        double finalTime = System.currentTimeMillis();
        
        System.out.println(queue);
        System.out.println(finalTime/1000);
/*
 * Implementation note: this implementation provides O(log(n)) time for the 
 * enqueuing and dequeuing methods (offer, poll, remove() and add); 
 * linear time for the remove(Object) and contains(Object) methods; and constant time
 * for the retrieval methods (peek, element, and size).
 * 
 * Testes para a contagem de tempo foram feitos aumentando a quantidade de chamadas do método Offer()
 * 
 * Unidade de Medida de Tempo: segundos
 * Runed in a MacBook Pro with M1 Chip
 */
    }
}