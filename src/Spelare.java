import java.util.ArrayList;
import java.util.Scanner;

public class Spelare {
    public String position;
    public ArrayList<AktivtVapen> Ryggsäck;
    public Scanner sc = new Scanner(System.in);


    public double användAttack(double styrka, double motHp){
        motHp=motHp-styrka;
        return motHp;
    }

    public void fullRyggsäck(){
        System.out.println("Din ryggsäck är full!");
        System.out.println("Vilket föremål vill du ta bort?");
        for (int i = 0; i < Ryggsäck.size(); i++) {
            int num = i+1;
            System.out.println(num+". "+Ryggsäck.get(i));

        }
        System.out.println("Vilket föremål vill du ta bort? (1-7)");
        String answer = sc.nextLine();
        switch (answer){
            case "1":
                Ryggsäck.remove(Ryggsäck.getFirst());
                break;
            case "2":
                Ryggsäck.remove(Ryggsäck.get(1));
                break;
            case "3":
                Ryggsäck.remove(Ryggsäck.get(2));
                break;
            case "4":
                Ryggsäck.remove(Ryggsäck.get(3));
                break;
            case "5":
                Ryggsäck.remove(Ryggsäck.get(4));
                break;
            case "6":
                Ryggsäck.remove(Ryggsäck.get(5));
                break;
            case "7":
                Ryggsäck.remove(Ryggsäck.get(6));
                break;
            default:
                System.out.println("Felaktig inmatning");
                System.out.println("Försök igen!");
        }
        return;
    }

    public double AnvändItem(double motHp, int runda){
        for (int i = 0; i < Ryggsäck.size(); i++) {
            int num = i+1;
            System.out.println(num+". "+Ryggsäck.get(i));
            }

        System.out.println("Vilket föremål vill du använda? (1-7)");
            String answer = sc.nextLine();
            switch (answer){
                case "1":
                    AktivtVapen föremål = Ryggsäck.getFirst();
                    föremål.Använd(motHp, runda);
                    break;
                case "2":
                    föremål = Ryggsäck.get(1);
                    föremål.Använd(motHp, runda);
                    break;
                case "3":
                    föremål = Ryggsäck.get(2);
                    föremål.Använd(motHp, runda);
                    break;
                case "4":
                    föremål = Ryggsäck.get(3);
                    föremål.Använd(motHp, runda);
                    break;
                case "5":
                    föremål = Ryggsäck.get(4);
                    föremål.Använd(motHp, runda);
                    break;
                case "6":
                    föremål = Ryggsäck.get(5);
                    föremål.Använd(motHp, runda);
                    break;
                case "7":
                    föremål = Ryggsäck.get(6);
                    föremål.Använd(motHp, runda);
                    break;
                default:
                    System.out.println("felaktig inmatning");
                    System.out.println("försök igen!");
            }

        return motHp;
    }
}
