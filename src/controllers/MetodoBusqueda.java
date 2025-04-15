package controllers;
import views.ShowConsole;
import models.Persona;

public class MetodoBusqueda {
    
    private ShowConsole showConsole;
    //private int[] arreglo;
    private Persona[] people;

    public MetodoBusqueda(Persona[] people){
        showConsole = new ShowConsole();
        this.people = people;
        showPersonByCode();
    }

    public MetodoBusqueda(){
        
    }

    public int busquedaLineal(int[] arreglo, int numeroEncontrar){
        int cont=0;
        for (int i : arreglo) {
            if (i == 8){
                return cont;
            }
            cont++;
        }
        return -1;
    }

    public int findPersonByCode(int codigo){
        for(int i=0; i<people.length; i++){
            if(people[i].getCodigo() == codigo){
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode(){
        int codeToFine = showConsole.getCodigo();
        int indexPerson = findPersonByCode(codeToFine);
        if (indexPerson >= 1){
            showConsole.showMessage("Persona encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        }else{
            showConsole.showMessage("Persona con codigo: "+codeToFine+" no encontrada");
        }
    }


}
