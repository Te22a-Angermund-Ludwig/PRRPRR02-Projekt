import java.util.Random;

public class Väg {
    public Random rnd = new Random();
    public Integer rutTyp;
    public Integer antalRutor = rnd.nextInt(0,3);

    public void GenereraKarta(){
        for (int i = 0; i < antalRutor; i++) {
            rutTyp = rnd.nextInt(0,2);
            if (rutTyp == 1){
                PassivRuta passivRuta = new PassivRuta();
                passivRuta.GenereraRuta();
            }
            else {
                Monster monster1 = new Monster();
            }
        }
    }

    public void VäljVäg(){
        
    }
}
