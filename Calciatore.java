public class Calciatore {

    private String nome;
    private int numeroMaglia;
    private String ruolo;


    public Calciatore(String string, int i, String string2) {
        //TODO Auto-generated constructor stub
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
        // TODO Auto-generated method stub
        return getNome()+" "+ getNumeroMaglia()+" "+ getRuolo();
    }
}
