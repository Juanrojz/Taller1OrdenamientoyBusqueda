class  Main{
public static void main(String[] args) {
    MisAlgoritmos misAlgoritmos = new MisAlgoritmos();

    int[] arrayDesordenado = {70, 12, 19, 45, 11, 33, 26};
    int[] arrayOrdenado = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};


    System.out.println("Busquedaaas");
    int elementoABuscar = 45;
    int indiceLinear = misAlgoritmos.linearSearch(arrayDesordenado, elementoABuscar);
    System.out.println("LinearSearch- el elemento" + elementoABuscar + "esta en la posicion" + indiceLinear);

    int elementoInexistente = 100;
    int indiceLinearNoEncontrado = misAlgoritmos.linearSearch(arrayDesordenado, elementoInexistente);
    System.out.println("LinearSearch - el elemento" + elementoInexistente + "esta en la posicion" + indiceLinearNoEncontrado + "(no encontrado)");

    int elementoBinario = 38;
    int indiceBinario = misAlgoritmos.binarySearch(arrayOrdenado, elementoBinario);
    System.out.println("BinarySearch - el elemento" + elementoBinario + "esta en la posicion" + indiceBinario);

    int elementoBinarioInexistente = 99;
    int indiceBinarioNoEncontrado = misAlgoritmos.binarySearch(arrayOrdenado, elementoBinarioInexistente);
    System.out.println("BinarySearch - el elemento " + elementoBinarioInexistente + "esta en la posicion" + indiceBinarioNoEncontrado + "(no encontrado");
    System.out.println();

    System.out.println("Ordenamientos");

    System.out.print("Arreglo original- ");
    for(int i = 0; i < arrayDesordenado.length; i++) {
        System.out.print(arrayDesordenado[i]+" ")
        ;
    }
    System.out.println();
    int[] resultadoBubble = misAlgoritmos.bubbleSort(arrayDesordenado);
    System.out.print("BubbleSort - ");
    for (int i = 0; i < resultadoBubble.length;i++){
        System.out.print(resultadoBubble[i]+ " ");

    }
    System.out.println();
    int[] resultadoSelection = misAlgoritmos.selectionSort(arrayDesordenado);
    System.out.print("SelectionSort: ");
    for (int i = 0; i < resultadoSelection.length;i++){
        System.out.print(resultadoSelection[i]+" ");

    }
    System.out.println();
    int[] resultadoInsertion= misAlgoritmos.insertionSort(arrayDesordenado);
    System.out.print("InsertionSort - ");
    for (int i = 0; i < resultadoInsertion.length; i++){
        System.out.print(resultadoInsertion[i] + " ");

    }
    System.out.println();
    int[] resultadoMerge= misAlgoritmos.mergeSort(arrayDesordenado);
    System.out.print("MergeSort -  ");
    for( int i = 0; i < resultadoMerge.length; i++){
        System.out.print(resultadoMerge[i]+ " ");

    }
    System.out.println();

    int[] resultadoQuick = misAlgoritmos.quickSort(arrayDesordenado);
    System.out.print("QuickSort- ");
    for( int i = 0; i <resultadoQuick.length;i++){
        System.out.print(resultadoQuick[i] + " ");

    }
    System.out.println();
    System.out.print("Arreglo original sin modificar - ");
    for (int i = 0; i< arrayDesordenado.length; i++){
        System.out.print(arrayDesordenado[i]+" ");

    }
    System.out.println();
}


}