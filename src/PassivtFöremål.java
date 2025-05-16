public class PassivtFöremål extends Föremål {
    public double hpÖkning;
    public double styrkeÖkning;
    public double hastighetsÖkning;

    public double uppPlock(double hp, double styrka, double hastighet) {
        if (hpÖkning > 0) {
            hp = hp + hpÖkning;
            return hp;
        } else if (styrkeÖkning > 0) {
            styrka = styrka + styrkeÖkning;
            return styrka;
        } else
            hastighet = hastighet + hastighetsÖkning;
        return hastighet;
    }
}