import java.util.Random;

public class Monster extends Varelser{
    public Random rnd = new Random();
    public Integer val;
    public Integer buff = 3/2;

    public Integer Attack(Integer motHp, Integer styrka){
        motHp=motHp-styrka;
        return motHp;
    }

    public Integer Buff(Integer styrka){
        styrka= styrka*buff;
        return styrka;
    }

    public Integer Motståndare(Integer hp, Integer styrka, Integer maxHp, Integer motHp){
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
        }
        else {
            return Attack(motHp,styrka);
        }
    }
}
