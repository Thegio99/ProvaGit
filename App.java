import java.util.ArrayList;

public class  App{
    public static void main(String[] args){

        Calciatore c1 = new Calciatore("Messi", 10, "AT");
        c1.toString();
        Calciatore c2 = new Calciatore("Leao", 10, "ATT");
        c2.toString();

        ArrayList<Calciatore> playerList= new ArrayList<>();
        playerList.add(c1);
        playerList.add(c2);
        


    }


}