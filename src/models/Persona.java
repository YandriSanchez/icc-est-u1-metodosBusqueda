package models;

public class Persona {
    private int codigo;
    private String name;

    public Persona(int codigo, String name){
        this.codigo = codigo;
        this.name = name;
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Persona {codigo= "+codigo+" ; name= "+name+" }";
    }

}
