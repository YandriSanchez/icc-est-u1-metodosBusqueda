package controllers;
import models.Persona;
import views.ShowConsole;

public class MetodosBusquedaBinaria {
    
    private Persona[] people;
    private ShowConsole pantalla;

    public MetodosBusquedaBinaria(Persona[] people){
        this.people = people;
        System.out.println("Clase Metodo Busqueda Binaria creada");
        this.pantalla = new ShowConsole();
        pantalla.showMessage("Metodos de Busqueda Binaria");
    }

    public int findPersonByCode(int codigo){
        int bajo = 0;
        int alto = people.length -1;

        while (bajo <= alto){
            int central = bajo + (alto - bajo) / 2;

            if (people[central].getCodigo() == codigo ){
                return central;
            }
            if (people[central].getCodigo() < codigo){
                bajo = central + 1;
            }else {
                alto = central - 1;
            }
        }
        return-1;
    }

    public void showPersonByCode2(){
        int codeToFind = pantalla.getCodigo();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson == -1){
            pantalla.showMessage("No hay la persona con este codigo");
        } else {
            pantalla.showMessage("Persona con codigo " + codeToFind + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    public void showPersonByCode3(){
        String namefind = pantalla.getName();
        int indexPerson = findPersonByName(namefind);
        if (indexPerson == -1){
            pantalla.showMessage("No hay la persona con ese nombre");
        } else {
            pantalla.showMessage("Persona con nombre " + namefind + " encontrada");
            pantalla.showMessage(people[indexPerson].toString());
        }
    }

    private int findPersonByName(String name){
        sortByName(people);
        for (Persona persona : people) {
            System.out.println(persona.toString());
        }
        int bajo = 0;
        int alto = people.length -1;

        while (bajo <= alto){
            
            int central = bajo + (alto - bajo) / 2;
            if (people[central].getName().equals(name)){
                return central;
            }
            if (people[central].getName().compareTo(name) < 0 ){
                bajo = central + 1;
            }else {
                alto = central - 1;
            }
        }
        return -1;
    }

    public void sortByName(Persona[] people){
        for(int i=0; i<people.length-1; i++){
            for(int j=0; j<people.length-1-i; j++){
                if((people[j].getName().compareTo(people[j+1].getName())) > 0){
                    //Intercambiar
                    Persona temp = people[j];
                    people[j] = people[j+1];
                    people[j+1]=temp;
                }
            }
        }
    }
}
