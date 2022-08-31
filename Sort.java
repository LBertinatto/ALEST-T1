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
        int A[] = {0,12,14,18,2,3,25,89,76,55,34,90,49,33};
        quicksort(A, 0, A.length-1);

        double finalTime = System.currentTimeMillis();
        System.out.println("");
        System.out.println("FINAL TIME: " + A.length);
        System.out.println(finalTime/1000);
        
        //Unidade de Medida: segundos
        //Runed in a MacBook Pro with M1 Chip
    }
}
