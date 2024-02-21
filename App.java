import java.util.ArrayList;
import java.util.Scanner;

public class  App{
    static Scanner sc =new Scanner(System.in);
    static ArrayList<Calciatore> playerList= new ArrayList<>();
    public static void main(String[] args){

        System.out.println("Inserire 0 per uscire");
        System.out.println("Inserire 1 per aggoingere calciatore");
        System.out.println("Inserire 2 per stampare lista calciatori");
        
        String s = sc.nextLine();

        while((!s.equals("0")) ){
        switch (s) {
            case "1":
                insPlayer();
                break;
            case "2":
                printPlayer();
            default:
                break;
        }
        System.out.println("Scegli nuovamente :");
        s = sc.nextLine();
    }

}

    public static void insPlayer(){
        System.out.println("Inserisci nome :");
        String name = sc.nextLine();
        System.out.println("Inserisci numero Maglia :");
        int numberShirt = sc.nextInt();
        sc.nextLine(); // Consuma il carattere di nuova linea nel buffer
        System.out.println("Inserisci ruolo :");
        String ruolo = sc.nextLine();
        
        Calciatore c = new Calciatore(name, numberShirt, ruolo);
        playerList.add(c);
        

    }

    public static void printPlayer(){
        for (Calciatore calciatore : playerList) {
            System.out.println(calciatore.toString());
        }
    }
    
}