import java.util.Scanner;

public class DinTur {
    public int runda;
    public Scanner sc = new Scanner(System.in);
    public String namn;

    public void börja(){
        System.out.println("Välkommen!");
        System.out.println("Vad är ditt namn?");
        namn = sc.nextLine();

    }

    public void spel(int fart, int motFart ,Monster monster, Djur spelare){
        runda =1;
        while(true){
            if (motFart<= fart){
                dinTur(monster.hp, spelare.styrka);
                monster.Attack(spelare.hp, monster.styrka);
            }
            else {
                monster.Attack(spelare.hp, monster.styrka);
                dinTur(monster.hp, spelare.styrka);
            }
            runda++;
            if (monster.hp<=0){
                System.out.println("Du vann!");
                break;
            } else if (spelare.hp<=0) {
                System.out.println("Du förlorade!");
                System.out.println("Bättre lycka nästa gång!");
                System.exit(0);
            }
        }

    }

    public void dinTur(double motHp,double styrka){
        System.out.println("Vad vill du göra?");
        System.out.println("1. Attackera");
        System.out.println("2. Använda item");
        String ans = sc.nextLine();
        switch (ans) {
            case "1":
                //attackera

            case "2":
                //använd item
        }
    }
}
