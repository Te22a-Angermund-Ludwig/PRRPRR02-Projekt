import java.util.Random;

public class Väg {
    public Random rnd = new Random();
    public int rutTyp;
    public int antalRutor = rnd.nextInt(0,3);

    public void GenereraKarta(){
        for (int i = 0; i < antalRutor; i++) {
            rutTyp = rnd.nextInt(0,2);
            if (rutTyp == 1){
                PassivRuta passivRuta = new PassivRuta();
                passivRuta.GenereraRuta(i);
            }
            else {
                Monster monster1 = new Monster();
            }
        }
    }

    public void VäljVäg(){
        
    }
}
