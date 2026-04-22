public class App {
    public static void main(String[] args) throws Exception {
        //int[] numeros={10,0,-5,5,15,2,};
        runBubbleSortAvz();
    }

    // public static void runBubbleSort(){
    //     System.out.println("Metodo Burbuja");
    //     //instancia de la clase
    //     int[] numeros={ -5,10,2,0,7 };
    //     BubbleSort bubbleSort = new BubbleSort();
    //     bubbleSort.printArreglo(numeros);  
    //     // bubbleSort.sortAscendente(numeros); 
    //     // bubbleSort.printArreglo(numeros);
    //     // bubbleSort.sortDescendete(numeros);
    //     // bubbleSort.printArreglo(numeros);
    //     bubbleSort.sort(numeros,  true);
    //     bubbleSort.printArreglo(numeros);
    //     bubbleSort.sort(numeros, false);
    //     bubbleSort.printArreglo(numeros);

    // }

    public static void runBubbleSortAvz(){
        int[] array = new int[] {9,2,3,0,8,5,10,50,100};
        BubbleSortAvz bSortAvz= new BubbleSortAvz(array);
        bSortAvz.printArreglo();
        bSortAvz.sort(true);
        bSortAvz.printArreglo();
        // bSortAvz.sortdesendente(false);
        // bSortAvz.printArreglo();

       
    }
}
