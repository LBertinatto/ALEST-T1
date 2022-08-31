import java.lang.reflect.Array;
import java.util.*;
/*
 * “The size, isEmpty, get, set, iterator, and listIterator operations run in constant time. 
 * The add operation runs in amortized constant time, that is, adding n elements requires O(n) time. 
 * All of the other operations run in linear time (roughly speaking). The constant factor is low compared
 *  to that for the LinkedList implementation.” Fonte: ORACLE, Java SE API [4]
 */
public class IsEmpty {
    public static void main(String args[]){
        ArrayList<String> set = new ArrayList<String>();

        double inicio = System.currentTimeMillis();

        for(int i = 0; i < 50; i++ ){
            set.isEmpty();
        }

        double primeiroTempo = System.currentTimeMillis() - inicio;

        inicio = System.currentTimeMillis();

        for(int i = 0; i < 100; i++ ){
            set.isEmpty();
        }
        
        double segundoTempo = System.currentTimeMillis() - inicio;

        inicio = System.currentTimeMillis();

        for(int i = 0; i < 150; i++ ){
            set.isEmpty();
        }
        
        double terceiroTempo = System.currentTimeMillis() - inicio;
        

        System.out.println("Primeira execução, com 50 verificações: " + primeiroTempo + "ms");
        System.out.println("   " + (primeiroTempo / 50) + "ms por execução");
        
        System.out.println("Segunda execução, com 100 verificações: " + segundoTempo + "ms");
        System.out.println("   " + (segundoTempo / 100) + "ms por execução");
        
        System.out.println("Terceira execução, com 150 verificações: " + segundoTempo + "ms");
        System.out.println("   " + (terceiroTempo / 150) + "ms por execução");
        
        System.out.println("\nConclusão: O(k)");
        
        //Unidade de medida: milissegundos
        //Runed in a MacBook Pro with M1 Chip
    }
}

