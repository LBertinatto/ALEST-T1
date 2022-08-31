import java.util.*;
/*
 * “The size, isEmpty, get, set, iterator, and listIterator operations run in constant time. 
 * The add operation runs in amortized constant time, that is, adding n elements requires O(n) time. 
 * All of the other operations run in linear time (roughly speaking). The constant factor is low compared
 *  to that for the LinkedList implementation.” Fonte: ORACLE, Java SE API [4]
 */
public class IsEmpty2 {
    public static void main(String args[]){
        ArrayList<String> set = new ArrayList<>();

        for(int i = 0; i<13; i++ ){
        set.isEmpty();
        }

        double tempo = System.currentTimeMillis();
        System.out.println(tempo/1000);
        //Unidade de medida: segundos
        //Runed in a MacBook Pro with M1 Chip
    }
}

