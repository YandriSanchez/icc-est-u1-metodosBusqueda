package controllers;
import views.ShowConsole;

public class MetodoBusqueda {
    
    private ShowConsole showConsole;
    private int[] arreglo;

    public int busquedaLineal(int[] arreglo, int numeroEncontrar){

        int cont=0;

        for (int i : arreglo) {
            
            if (i == 8){
                return cont;
            }
            cont++;
        }

        return cont;
    }

}
