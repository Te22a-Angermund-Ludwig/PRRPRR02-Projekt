public class HelandeRuta extends PassivRuta{
    public double helande;

    public double Hela(double Hp){
        helande = Hp/3;
        Hp = Hp + helande;
        return Hp;
    }
}
