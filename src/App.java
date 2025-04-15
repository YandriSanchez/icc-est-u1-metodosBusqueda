import controllers.MetodoBusqueda;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        
        MetodoBusqueda metodoBusqueda = new MetodoBusqueda();

        int[] arreglo = {4,5,7,3,6,8,3,0,9};
        for (int i : arreglo) {
            System.out.print(i+" ; ");
        }
        System.out.println("Vamos a encontrar el numero 8");
        int posicion = metodoBusqueda.busquedaLineal(arreglo, 8);
        System.out.println("Se encontro en la posicion "+posicion+" el numero 8");

        Persona[] persons = new Persona[7];
        persons[0] = new Persona(101,"Juan");
        persons[1] = new Persona(102,"Pepito");
        persons[2] = new Persona(103,"Pedro");
        persons[3] = new Persona(104,"Erik");
        persons[4] = new Persona(105,"pedro");
        persons[5] = new Persona(106,"Erika");
        persons[6] = new Persona(107,"Maria");
        
        MetodoBusqueda metodoBusque = new MetodoBusqueda(persons);

        
        

    }
}
