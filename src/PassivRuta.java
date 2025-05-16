import java.util.Random;

public class PassivRuta {
    public boolean typ;
    Random rnd = new Random();
    public void GenereraRuta(int Ruta){
        typ = rnd.nextBoolean();
        if (typ){
            switch (Ruta){
                case 1:
                    Butik butik1 = new Butik();
                    break;
                case 2:
                    Butik butik2 = new Butik();
                    break;
                case 3:
                    Butik butik3 = new Butik();
                    break;
            }
        }
        else {
            switch (Ruta){
                case 1:
                    HelandeRuta helandeRuta1 = new HelandeRuta();
                    break;
                case 2:
                    HelandeRuta helandeRuta2 = new HelandeRuta();
                    break;
                case 3:
                    HelandeRuta helandeRuta3 = new HelandeRuta();

            }
        }
    }
}
