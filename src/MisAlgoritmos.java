public class MisAlgoritmos implements Ordenamientos, Busquedas {
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
        for(int i = 0; i < arrayPorExplorar.length;i++){
            if(arrayPorExplorar[i] == elementoABuscar){
            return i;
            }
        }
        return -1;
    }

    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {
      int ini=0;
      int fin=arrayPorExplorar.length -1;
        while (ini<= fin ){
            int medio = ini + (fin-ini) / 2 ;

            if(arrayPorExplorar[medio] ==elementoABuscar){
                return medio;
            }
            if(arrayPorExplorar[medio] < elementoABuscar){
                ini=medio+1;
            } else fin = medio - 1;
        }
        return -1;
    }

    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {
        int[] array = arrayDesordenado.clone();
            for(int i =0; i< array.length - 1; i++) {
                for (int j = 0; j <array.length - 1 -i; j++) {
                    if(array[j] > array[j+1]) {
                        int temporal = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temporal;
                    }
                }
        }
        return array;
    }

    @Override
    public int[] selectionSort(int[] arrayDesordenado) {
        int[] array = arrayDesordenado.clone();

        for (int i = 0; i < array.length - 1; i++) {
            int iM = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[iM]) {
                    iM = j;
                }
            }

            if (iM != i) {
                int temporal = array[i];
                array[i] = array[iM];
                array[iM] = temporal;
            }
        }

        return array;

    }

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {
        int[] array = arrayDesordenado.clone();
        for (int i = 1; i < array.length; i++) {
            int actual = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > actual) {
                array[j + 1] = array[j];
                j--;


            }

            array[j + 1] = actual;

        }
        return array;
    }
    @Override
    public int[] mergeSort(int[] arrayDesordenado) {
        int[] array = arrayDesordenado.clone();
        int n = array.length;
        for (int anchoarreglo = 1; anchoarreglo < n; anchoarreglo *= 2) {
            for (int ini = 0; ini < n - anchoarreglo; ini += 2 * anchoarreglo) {
                int medio = ini + anchoarreglo - 1;
                int fin = Math.min(ini + 2 * anchoarreglo - 1, n - 1);
                int tamanoI = medio - ini + 1;
                int tamanoD = fin - medio;
                int[] arregloI = new int[tamanoI];
                int[] arregloD = new int[tamanoD];

                for (int i = 0; i < tamanoI; i++) {
                    arregloI[i] = array[ini + i];
                }
                for (int j= 0; j < tamanoD; j++){
                    arregloD[j]= array[medio + 1 +j];
                }
                int i = 0;
                int j = 0;
                int k = ini;
                while (i < tamanoI && j < tamanoD) {
                    if (arregloI[i] <= arregloD[j]) {
                        array[k] = arregloI[i];
                        i++;
                    } else {
                        array[k] = arregloD[j];
                        j++;
                    }
                    k++;

                }
                while (i < tamanoI) {
                    array[k] = arregloI[i];
                    i++;
                    k++;

                }
                while (j < tamanoD) {
                    array[k] = arregloD[j];
                    j++;
                    k++;

                }
            }

        }
        return array;
    }
    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        int[] array = arrayDesordenado.clone();
        int n = array.length;
        if (n < 2) {
            return array;
        }
        int[] pila = new int[2 * n];
        int tope = -1;

        tope++;
        pila[tope] = 0;
        tope++;
        pila[tope] = n - 1;

        while (tope > 0) {
            int fin = pila[tope];
            tope--;
            int inicio = pila[tope];
            tope--;

            if (inicio < fin) {
                int pivote = array[fin];
                int i = inicio - 1;
                for (int j = inicio; j < fin; j++) {
                    if (array[j] <= pivote) {
                        i++;
                        int temporal = array[i];
                        array[i] = array[j];
                        array[j] = temporal;
                    }
                }
                int temporal = array[i + 1];
                array[i + 1] = array[fin];
                array[fin] = temporal;

                int indiceP = i + 1;
                tope++;
                pila[tope] = inicio;
                tope++;
                pila[tope] = indiceP - 1;
                tope++;
                pila[tope] = indiceP + 1;
                tope++;
                pila[tope] = fin;
            }
        }
        return array;


    }
}