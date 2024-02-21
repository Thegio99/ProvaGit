import java.util.ArrayList;
import java.util.Collections;

public class Squadra {

    private String nome;
    private ArrayList<Calciatore> calicatori;

    public Squadra(String nome){
        this.nome=nome;
        this.calicatori= new ArrayList<>();
    }

    public void addPlayer(Calciatore c){
        calicatori.add(c);
    }

    public void removePlayer(Calciatore c){
         calicatori.remove(c);
        }
    
    public void viewSquad(){
        System.out.printf("Squadra: %s%n",getNome());
        for (Calciatore calciatore : calicatori) {
            System.out.println("Nome: "+calciatore.getNome()+" Numero: "+calciatore.getNumeroMaglia()+" Ruolo: "+calciatore.getRuolo());
        }
    }
    
    public void sortPlayer(){
        Collections.sort(calicatori);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
