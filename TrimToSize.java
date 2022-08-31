import java.util.*;

public class TrimToSize{

    public static void main(String[] args) {
      ArrayList<Integer> set = new ArrayList<Integer>(14);
      set.add(1);
      set.trimToSize();

      double tempo = System.currentTimeMillis();
        System.out.println(tempo/1000);

        /*
        “The size, isEmpty, get, set, iterator, and listIterator operations run in constant time. 
        * The add operation runs in amortized constant time, that is, adding n elements requires O(n) time. 
        * All of the other operations run in linear time (roughly speaking). The constant factor is low compared
        * to that for the LinkedList implementation.” Fonte: ORACLE, Java SE API [4]
        *     Como está na classe java.util.ArrayList, o método trimToSize se classifica como "all of the other operatoins",
        *     conforme descrito acima, sendo assim, tem tempo de execução O(n).
        *
        * Colocou-se um elementono ArrayList para inicializaçã0
        * Testes de tempo foram feitos aumentando o tamanho do ArrayList inicial, 
        * considerando assim a quantidade de sizes a serem decrementados do tamanho do 
        * ArrayList durante a execução do método
        *
        * Unidade de Medida: segundos
        * Runed in a Macbook Pro with M1 Chip
        */
      }
  }
   
  
  
    
 
