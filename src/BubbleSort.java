public class BubbleSort {
    // Constructor
    public BubbleSort(){
        System.out.println("Se creo la clase en el instructor");
    }

    public void sortAscendente(int numeros[]){
        for (int i=0; i<numeros.length;i++){
            for(int j=i+1;j<numeros.length;j++){
                //comparacion
                if(numeros[i]>numeros[j]){
                    //si cumple realizamos el intercambio
                    int aux = numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j] = aux;
                }
            }
        }
    }
    public void sortDescendete(int[] numeros){
        for (int a=0; a<numeros.length;a++){
            for (int b=a+1; b<numeros.length;b++){
                if(numeros[a]<numeros[b]){
                    //si cumple realizamos el intercambio
                    int aux1 = numeros[a];
                    numeros[a]=numeros[b];
                    numeros[b] = aux1;
                }
            }
        }
    }
    public void sort (int[] numeros,boolean asc){
        if(asc == true){
            sortAscendente(numeros);
        }else{
            sortDescendete(numeros);
        }
    }

    public void printArreglo(int[] numeros) {
        for(int i: numeros){
            System.out.print(i + ",");
        }
        System.out.println();
    }
}