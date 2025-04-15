import controllers.MetodoBusqueda;

public class App {
    public static void main(String[] args) throws Exception {
        
        MetodoBusqueda metodoBusqueda = new MetodoBusqueda();

        int[] arreglo = {4,5,7,3,6,8,3,0,9};
        
        System.out.println("Vamos a encontrar el numero 8");
        int posicion = metodoBusqueda.busquedaLineal(arreglo, 8);
        System.out.println("Se encontro en la posicion "+posicion+" el numero 8");

    }
}
