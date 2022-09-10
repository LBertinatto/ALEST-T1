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
