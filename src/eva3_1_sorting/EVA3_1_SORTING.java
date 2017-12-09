
package eva3_1_sorting;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class EVA3_1_SORTING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo=new int[10];
        for (int i = 0; i < iArreglo.length; i++) {
            iArreglo[i]=(int)(Math.random()*100);
            
        }
        imprimirArreglo(iArreglo);
        //selectionSort(iArreglo);
        imprimirArreglo(iArreglo);
        insertionSort(iArreglo);
        imprimirArreglo(iArreglo);
        Scanner scBusca=new Scanner(System.in);
        System.out.println("Valor a buscar");
        int iVal=scBusca.nextInt();
        int iResu=binarySearch(iArreglo, iVal);
        System.out.println(iResu);
    }
    public static void imprimirArreglo(int[] iArre){
        for (int i = 0; i < iArre.length; i++) {
            System.out.print("[" + iArre[i] + "]");
        }
        System.out.println("");
    }
    public static void selectionSort(int[] iArre){
        int iComp=0;
        int iSwap=0;
        for (int i = 0; i < iArre.length; i++) {
            int iMin=i;
            for (int j = i+1; j < iArre.length; j++) {//Busca el menor
                if(iArre[j]<iArre[iMin]){
                
                iMin=j;//Guarda la posición del más pequeño.
                }
             iComp++;   
            }
            //Intercambio
            int iTemp=iArre[iMin];
            iArre[iMin]=iArre[i];
            iArre[i]=iTemp;
            iSwap++;
        }
        System.out.println("Comparaciones: " +iComp);
        System.out.println("Interacambios: " +iSwap);
    }
    public static void insertionSort(int[] iArre){
            for (int i = 0; i < iArre.length; i++) {
                for (int j = 0; j < iArre.length; j++) {
                    
                }
        }
        }
    public static int binarySearch(int[] arreglo, int iValorBuscar){
        return binSearchRec(arreglo, iValorBuscar, 0, arreglo.length -1);
    }
    private static int binSearchRec(int[] arreglo, int iValorBuscar, int iLo, int iHi){
        int iPos= -1;
        int iMid=iLo+((iHi-iLo)/2);
        if(iLo<=iHi){
        if(iValorBuscar == arreglo[iMid]){//Lo encontramos
            iPos=iMid;
        }else if(iValorBuscar < arreglo[iMid]){//Busca en la mitad inferior.
            iPos=binSearchRec(arreglo, iValorBuscar, iLo, iMid - 1);
        }else if(iValorBuscar > arreglo[iMid]){//Buscan en la mitan superior.
            iPos=binSearchRec(arreglo, iValorBuscar, iMid + 1, iHi);
        }
        }
        return iPos;
    }
            
}
