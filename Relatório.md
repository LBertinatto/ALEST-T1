# T1 - ALEST

\- Leonardo Bertinatto

\- Caio Fernandes

### Classes de Complexidade Analisadas:

\- IsEmpty() - O(k)

\- Offer() - O(log(n))

\- forEach() - O(n)

\- Sort() - O(n log(n))

  

### <a href="https://brpucrs-my.sharepoint.com/:x:/g/personal/leonardo_bertinatto_edu_pucrs_br/EYva4pSeUBxKrk6ZRQVtJtoBngugzxbH05pI3nqHJkW6AQ?e=wgOPJR">Planilha para gráfico de Análise Assintótica:</a>  

### <a href="https://github.com/LBertinatto/ALEST-T1.git">Repositório GitHub:</a>

  

* * *

isEmpty() - O(k)
----------------

  

```java
/*
* “The size, isEmpty, get, set, iterator, and listIterator operations run in constant time. 
* The add operation runs in amortized constant time, that is, adding n elements requires O(n) time. 
* All of the other operations run in linear time (roughly speaking). The constant factor is low compared
*  to that for the LinkedList implementation.” Fonte: ORACLE, Java SE API [4]
*/

import java.util.*;

public class IsEmpty {
    public static void main(String args[]){
        //Inicializando ArrayList para realizar a contagem de operaçoes do método.
        ArrayList<Integer> set = new ArrayList<Integer>();

        //O método isEmpty() é implementado da seguinte maneira:

        //    public boolean isEmpty() {
        //        return size == 0;
        //    }
        //
        //Fonte: https://hg.openjdk.java.net/jdk8/jdk8/jdk/file/687fd7c7986d/src/share/classes/java/util/ArrayList.java

        //Será utilizado um "for" para iniciar diferentes contagens, executar o método e adicionar 100 elementos ao ArrayList.
        //Após cada execução será mostrado no console o número de operações realizadas.

        for (int i = 0; i < 100; i++){
            //Gerando o contador
            int count = 0;

            //Simulação do método:
            boolean aux = set.size() == 0;

            //Operação "==":
            count++;

            //Operação "return" (representada pelo "="):
            count++;
            
            System.out.printf("# %3d execução: %d%n",(i+1),count);

            set.add((int)Math.round(Math.random() * 100));
        }
    }
}
```

![](https://t36934986.p.clickup-attachments.com/t36934986/dc85b495-f250-4634-8b67-9facdb16b361/image.png)

![](https://t36934986.p.clickup-attachments.com/t36934986/ed36590a-62ec-46a1-ab07-a2c04c007273/image.png)

  

Conclusão: Em todos os casos o método realiza apenas duas operações, caracterizando O(k) e confimando sua documentação.

  

* * *

Offer() - O(log n)
------------------

```java
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
```

  

![](https://t36934986.p.clickup-attachments.com/t36934986/d477aab2-f904-40f0-b456-007bc5e8498c/image.png)

  

![](https://t36934986.p.clickup-attachments.com/t36934986/30d448a5-181d-42b6-9221-948c83ce11db/image.png)

  

Conclusão: Baseando-se na documentação do método e observando a curva obtida ao comparar a quantidade de execuções e o tempo que elas levaram pra acontecer, chegamos a conclusão que o método possui o comportamente de O(log n).

  

* * *

forEach() - O(n)
----------------

```java
import java.util.*;

public class ForEach{

  public static void main(String[] args) {
    int quantity = (int)Math.floor(354836039 / 10);

    for (int i = 0; i < 10; i++){
      ArrayList<Integer> set = new ArrayList<Integer>();

      for (int j = 0; j < quantity; j++)
        set.add((int)Math.floor(Math.random()) * 100);

      double beginTime = System.currentTimeMillis();

      set.forEach(x -> x = 2);

      double endingTime = System.currentTimeMillis();

      System.out.println((int)(endingTime - beginTime) + " " + quantity);

      quantity += (int)Math.floor(354836039 / 10);;
    }

    /*
    “The size, isEmpty, get, set, iterator, and listIterator operations run in constant time. 
    * The add operation runs in amortized constant time, that is, adding n elements requires O(n) time. 
    * All of the other operations run in linear time (roughly speaking). The constant factor is low compared
    * to that for the LinkedList implementation.” Fonte: ORACLE, Java SE API [4]
    *
    *     Como está na classe java.util.ArrayList, o método forEach se classifica como "all of the other operatoins",
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
```

  

![](https://t36934986.p.clickup-attachments.com/t36934986/41d05b63-f216-41df-98ca-de2d03cfa4b9/image.png)

  

![](https://t36934986.p.clickup-attachments.com/t36934986/ca443e2c-3f45-43e9-b359-15b3cb8438a0/image.png)

  

Conclusão: Baseando-se na documentação do método e observando a curva obtida ao comparar a quantidade de elementos em que o método age e o tempo que essas ações levaram pra acontecer, chegamos a conclusão que o método possui o comportamente de O(n).

  

* * *

Sort() - O(n log(n))
--------------------

  

```java
/*
The sorting algorithm is a Dual-Pivot Quicksort
     * by Vladimir Yaroslavskiy, Jon Bentley, and Joshua Bloch. This algorithm
     * offers O(n log(n)) performance on many data sets that cause other
     * quicksorts to degrade to quadratic performance, and is typically
     * faster than traditional (one-pivot) Quicksort implementations.
*/

public class Sort{
    public static void quicksort(int[] A){        
        quicksort(A, 0, A.length - 1);
    }
 
    private static void quicksort(int[] A, int inicio, int fim){        
        if(inicio < fim){
            //realiza a partição
            int q = partition(A, inicio, fim);
            //ordena a partição esquerda
            quicksort(A, inicio, q - 1);
            //ordena a partição direita
            quicksort(A, q + 1, fim);     
        }
    }
    private static int partition(int[] A, int inicio, int fim){
        //o pivo é o elemento final
        int pivo = A[fim];        
        int i = inicio - 1;
        /*
         * Este laço irá varrer os vetores da esquerda para direira
         * procurando os elementos que são menores ou iguais ao pivô.
         * Esses elementos são colocados na partição esquerda.         
         */
        
        for(int j = inicio; j <= fim - 1; j++){
       
            if(A[j] <= pivo){
                i = i + 1;
                swap(A, i, j);
            }
        }

        //coloca o pivô na posição de ordenação
        swap(A, i + 1, fim);
        
        return i + 1; //retorna a posição do pivô
    }
    
    //método auxiliar para realizar as trocas de elementos
    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
          
    }
//-----------------------------------------------TESTES--------------------------------------------
    public static void main(String[] args) {
        int capacidades[] = {10000, 50000, 100000, 175000, 250000, 375000, 500000};

        for (int j = 0; j < capacidades.length; j++){
            int A[] = new int[capacidades[j]];

            for (int i = 0; i < capacidades[j]; i++){
                A[i] = (int)Math.floor(Math.random() * 100);
            }

            double beginTime = System.currentTimeMillis();

            quicksort(A, 0, A.length-1);

            double finalTime = System.currentTimeMillis();

            System.out.println("\nExecutando com um vetor com tamanho " + capacidades[j] + ":");
            System.out.println(finalTime - beginTime);
        }

        //Unidade de Medida: segundos
        //Runed in a MacBook Pro with M1 Chip
    }
}
```

  

![](https://t36934986.p.clickup-attachments.com/t36934986/51b5687f-dfd5-4348-bc2e-32d9e18dcd14/image.png)

  

![](https://t36934986.p.clickup-attachments.com/t36934986/d1e44eca-9b1f-416c-9771-669cb174c4b1/image.png)

  

Conclusão: Baseando-se na referencia bibliográfica do método e observando a curva obtida ao comparar a quantidade de elementos em que o método age e o tempo que leva para ser executado, chegamos a conclusão que o método possui o comportamente de O(n log (n)).

  

* * *