import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;


public class  App{
    static Scanner sc =new Scanner(System.in);
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        System.out.println("Inserire 0 per uscire");
        System.out.println("Inserire 1 per aggiungere calciatore");
        System.out.println("Inserire 2 per stampare lista calciatori");
        System.out.println("Inserire 3 per ordinare la lista ");
        System.out.println("Inserire 4 per salvare la rosa in un file");
        System.out.println("Inserire 5 per caricare la rosa in un file");

        Squadra milan = new Squadra("Milan");
        
        String s = sc.nextLine();

        while((!s.equals("0")) ){
        switch (s) {
            case "1":
                /*System.out.println("inserisci nome ");
                String nome =sc.nextLine();
                System.out.println("inserisci numero di maglia");
                int numeroMaglia = sc.nextInt();
                sc.nextLine();
                System.out.println("inserisci ruolo calciatore");
                String ruolo = sc.nextLine();
                Calciatore c = new Calciatore(nome, numeroMaglia, ruolo); */
                Calciatore c = new Calciatore("leao", 10, "ATT");
                milan.addPlayer(c);
                break;
            case "2":
                 milan.viewSquad();
                 break;
            case "3":
                milan.sortPlayer();
                break;
            case "4":
                 addToFile(milan);
                 break;
            case "5":
                milan.getCalciatori().addAll(uploadToFile());
            default:
                break;
        }
        System.out.println("Inserire 0 per uscire");
        System.out.println("Inserire 1 per aggiungere calciatore");
        System.out.println("Inserire 2 per stampare lista calciatori");
        System.out.println("Inserire 3 per ordinare la lista ");
        System.out.println("Inserire 4 per salvare la rosa in un file");
        System.out.println("Inserire 5 per caricare la rosa in un file");
        s = sc.nextLine();
    }
}

        public static void addToFile(Squadra s) throws IOException{

            String path ="C:\\Users\\gmercuri\\OneDrive - NTT DATA EMEAL\\Desktop\\Corsogit\\Rosa.txt";
            File file = new File(path);

            if (file.exists())
                System.out.println("Il file " + path + " esiste");
            else if (file.createNewFile())
                System.out.println("Il file " + path + " è stato creato");
            else
                System.out.println("Il file " + path + " non può essere creato");

            
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(s.getCalciatori());
        }

        public static ArrayList<Calciatore> uploadToFile() throws ClassNotFoundException, IOException{

            String path ="C:\\Users\\gmercuri\\OneDrive - NTT DATA EMEAL\\Desktop\\Corsogit\\Rosa.txt";
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            return (ArrayList<Calciatore>) ois.readObject();
        }

}