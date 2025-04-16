package views;

import java.util.Scanner;

public class ShowConsole {
    
    private Scanner sc = new Scanner(System.in);

    public void showMenu(){
        System.out.println("Metodo Busqueda");
    }

    public int getCodigo(){
        System.out.println("Ingrese el codigo: ");
        int codigo = sc.nextInt();
        System.out.println("Codigo ingresado: "+codigo);
        return codigo;
    }

    public String getName(){
        System.out.println("Ingrese el nombre: ");
        String name = sc.next();
        System.out.println("Nomabre ingresado: "+name);
        return name;
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
