import java.util.List;

public class Equipo {

    private String nombreEquipo;
    private List<Atleta> atletas;
    private List<Disciplina> disciplinas;




    public String getNombreEquipo(){
        return this.nombreEquipo;

    }

    public void setNombreEquipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;

    }

    public List<Atleta> getAtletas(){
        return this.atletas;

    }


    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }

    public void agregarAtleta(Atleta atleta){
        atletas.add(atleta);

    }

    public void eliminarAtleta(Atleta atleta){
        atletas.remove(atleta);


    }

    public void mostrarInfoEquipo(){

    }

}
