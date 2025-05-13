public class AktivtVapen extends Föremål{
    public Integer rundTimer;
    public Integer skada;
    public boolean använt;
    public Integer cd;

    public Integer Använd(Integer motHp, Integer runda){
        cd = runda - rundTimer;
        if (använt){
            if (rundTimer <= runda){
                motHp = motHp - skada;
                rundTimer=runda+rundTimer;
            }
            else {
                System.out.println("Föremålet kan inte användas än!");
                System.out.println("testa igen om " + cd +" rundor!");
            }
        }
        else {
            rundTimer = runda + rundTimer;
            motHp = motHp - skada;
        }
        använt = true;
        return motHp;
    }
}
