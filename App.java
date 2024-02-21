import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class  App{
    static Scanner sc =new Scanner(System.in);
    
    public static void main(String[] args){

        System.out.println("Inserire 0 per uscire");
        System.out.println("Inserire 1 per aggiungere calciatore");
        System.out.println("Inserire 2 per stampare lista calciatori");
        System.out.println("Inserire 3 per ordinare la lista ");

        Squadra milan = new Squadra("Milan");
        
        String s = sc.nextLine();

        while((!s.equals("0")) ){
        switch (s) {
            case "1":
                System.out.println("inserisci nome ");
                String nome =sc.nextLine();
                System.out.println("inserisci numero di maglia");
                int numeroMaglia = sc.nextInt();
                sc.nextLine();
                System.out.println("inserisci ruolo calciatore");
                String ruolo = sc.nextLine();
                Calciatore c = new Calciatore(nome, numeroMaglia, ruolo);
                milan.addPlayer(c);
                break;
            case "2":
                 milan.viewSquad();
                 break;
            case "3":
                milan.sortPlayer();
                break;
            default:
                break;
        }
        System.out.println("Inserire 0 per uscire");
        System.out.println("Inserire 1 per aggiungere calciatore");
        System.out.println("Inserire 2 per stampare lista calciatori");
        System.out.println("Inserire 3 per ordinare la lista ");
        s = sc.nextLine();
    }

}
}