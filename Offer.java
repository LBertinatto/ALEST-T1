import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Offer {
    public static void main(String[] args) {
        int capacidades[] = {1000, 50000, 100000, 175000, 250000, 375000, 500000, 600000};
        boolean value;

        for (int j = 0; j < capacidades.length; j++){
            Queue queue = new ArrayBlockingQueue(capacidades[j]);

            double beginTime = System.currentTimeMillis();
            
            for(int i = 1; i <= capacidades[j]; i++ ){
                value = queue.offer(i);
            }
            
            double finalTime = System.currentTimeMillis();
            
            System.out.println("Operação executada " + capacidades[j] + " vezes::");
            System.out.println(finalTime - beginTime);
        }
        
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