public class AktivtVapen extends Föremål{
    public int rundTimer;
    public int skada;
    public boolean använt;
    public int cd;

    public int Använd(int motHp, int runda){
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
