import java.io.Serializable;

public class Calciatore implements  Comparable<Calciatore>, Serializable{

    private String nome;
    private int numeroMaglia;
    private String ruolo;

    //public Calciatore(){};

    public Calciatore(String nome, int numeroMaglia, String ruolo)  {
        //TODO Auto-generated constructor stub
        this.nome=nome;
        this.numeroMaglia=numeroMaglia;
        this.ruolo=ruolo;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroMaglia() {
        return numeroMaglia;
    }
    public void setNumeroMaglia(int numeroMaglia) {
        this.numeroMaglia = numeroMaglia;
    }
    public String getRuolo() {
        return ruolo;
    }
    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
        
    @Override
    public String toString() {
        return  getNome()+" "+ getNumeroMaglia()+" "+ getRuolo();
    }


    @Override
    public int compareTo(Calciatore o) {
        return this.getNome().compareTo(o.getNome());
    }
    
}
