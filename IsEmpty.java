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

        //Será utilizado um "for" para iniciar diferentes contagens, executar o método e adicionar 99 elementos ao ArrayList.
        //Após cada execução será mostrado no console o número de operações realizadas.

        for (int i = 0; i < 100; i++){
            //Gerando o contador
            int count = 0;

            //Simulação do método:
            boolean aux = set.size() == 0;

            //Operação "=":
            count++;
            //Operação "return":
            count++;
            
            System.out.println("#" + (i + 1) + " execução: " + count);

            set.add((int)Math.round(Math.random() * 100));
        }

        //Conclusão: Em todos os casos o método realiza apenas uma operação, caracterizando O(k).
    }
}

