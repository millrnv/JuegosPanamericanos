public class Disciplina {

    private String nombreDisciplina;
    private int nParticipantes;
    private double recordMundial;



    public String getNombreDisciplina(){
        return this.nombreDisciplina;


    }

    public void setNombreDisciplina(String nombreDisciplina){
        this.nombreDisciplina = nombreDisciplina;

    }

    public int getnParticipantes(){
        return this.nParticipantes;


    }

    public void setnParticipantes(int nParticipantes){
        this.nParticipantes = nParticipantes;


    }

    public double getRecordMundial(){
        return this.recordMundial;


    }

    public void setRecordMundial(double recordMundial){
        this.recordMundial = recordMundial;

    }

    public void mostrarInformacion(){
        System.out.println("Nombre de la disciplina: " + getNombreDisciplina());
        System.out.println("Número de participantes: " + getnParticipantes());
        System.out.println("Record mundial: " + getRecordMundial());

    }


}
