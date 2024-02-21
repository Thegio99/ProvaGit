import java.util.ArrayList;
import java.util.Scanner;

public class  App{
    static Scanner sc =new Scanner(System.in);
    static ArrayList<Calciatore> playerList= new ArrayList<>();
    public static void main(String[] args){

        
        

        System.out.println("Inserire calciatore ?");
        String s = sc.nextLine();
        
        if(s.equalsIgnoreCase("si")){
            insPlayer();
        }

        for (Calciatore calciatore : playerList) {
            System.out.println(calciatore.toString());
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

}