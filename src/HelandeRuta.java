public class HelandeRuta extends PassivRuta{
    public Integer helande;

    public Integer Hela(Integer Hp){
        helande = Hp/3;
        Hp = Hp + helande;
        return Hp;
    }
}
