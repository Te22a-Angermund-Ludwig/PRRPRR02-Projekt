import java.util.ArrayList;
import java.util.Scanner;

public class Butik extends PassivRuta{
    public ArrayList<Föremål> sortiment;
    public Scanner sc = new Scanner(System.in);

    public void butik(){
        for (int i = 0; i < sortiment.size(); i++) {
            System.out.println(i + ". " + sortiment.get(i));
        }
        System.out.println("Vilket föremål vill du köpa? (1-7)");
        String answer = sc.nextLine();
        switch (answer){
            case "1":

                break;

        }
    }

    public void köp(int antal, Föremål föremål, ArrayList<Föremål> ryggsäck){
        sortiment.remove(föremål);
        ryggsäck.add(föremål);
        antal--;
    }

    public void lämna(){

    }
}
