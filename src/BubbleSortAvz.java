public class BubbleSortAvz {
    int [] array;
    //variable global
    public BubbleSortAvz(int[] arreglo){
        // array = new int[]{10,5,0}; // forma darle valor directo
        //forma darle valor en base al parametro
        this.array = arreglo;
    }

    public void sort(boolean asc){
        int tam = array.length;
        boolean hubointercambio;
        int contComparaciones = 0;
        for(int i =0; i<tam-1;i++){
            hubointercambio=false;
            for(int j=0; j<tam-1-i;j++){
                if(array[j] > array[j+1]){
                    hubointercambio= true;
                    int aux = array[j];
                    array[j]= array[j+1];
                    array[j+1]=aux;
                }
                contComparaciones++;
            }
            if(!hubointercambio){
                break;
            }
        }
        System.out.println("Hubo un tola de: "+ contComparaciones);


    }
    // public void sortdesendente(boolean asc){
    //     int tam = array.length;

    //     for(int i =0; i<tam-1;i++){
    //         for(int j=0; j<tam-1-i;j++){
    //             if(array[j] < array[j+1]){
    //                 int aux = array[j];
    //                 array[j]= array[j+1];
    //                 array[j+1]=aux;
    //             }
    //         }
    //     }
    // }
    public void printArreglo() {
        for(int i: array){
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
