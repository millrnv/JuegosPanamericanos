import java.util.ArrayList;
import java.util.List;

public class Atleta {

    private String nombre;
    private String pais;
    private int edad;
    private List<Disciplina> disciplinas;

    public Atleta(){

        disciplinas = new ArrayList<>();

    }



    public String getNombre(){
        return this.nombre;

    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public String getPais(){
        return this.pais;

    }

    public void setPais(String pais){
        this.pais = pais;


    }

    public int getEdad(){
       return this.edad;

    }

    public void setEdad(int edad){
        this.edad = edad;

    }



    public void agregarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);



    }

    public void eliminarDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);



    }

    public void mostrarInfoAtleta(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("País: " + getPais());
        System.out.println("Edad: " + getEdad());
        System.out.println("Disciplinas: " + disciplinas);
    }




}
