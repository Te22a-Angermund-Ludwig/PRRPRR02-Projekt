import java.util.Random;

public class Monster extends Varelser{
    public Random rnd = new Random();
    public int val;
    public double buff = 1.5;
    public int pris;

    public double Attack(double motHp, double styrka){
        motHp=motHp-styrka;
        return motHp;
    }

    public double Buff(double styrka){
        styrka= styrka*buff;
        return styrka;
    }

    public double Motståndare(double hp, double styrka, double maxHp, double motHp){
        if (hp >= maxHp){
            val = rnd.nextInt(0,3);
            if (val==1){
                return Attack(motHp,styrka);
            }
            else {
                return Buff(styrka);
            }
        } else if (hp>= maxHp/2) {
            val = rnd.nextInt(0,3);
            if (val ==1){
                return Buff(styrka);
            }
            else {
                return Attack(motHp,styrka);
            }
        } else if (motHp>=styrka) {
            return Attack(motHp,styrka);

        } else {
            return Attack(motHp,styrka);
        }
    }
}
