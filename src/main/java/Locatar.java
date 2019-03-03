import java.io.Serializable;
import java.util.Comparator;

public class Locatar implements Serializable {

    private static final long serialVersionUID = -3828352955510559466L;
    String numeLocatar;
    private Apartament apartament;

    public Locatar(String numeLocatar, Apartament apartament) {
        this.numeLocatar = numeLocatar;
        this.apartament = apartament;
    }

    @Override
    public String toString() {
        return "Numele locatarului este " + numeLocatar + " si numarul apartamentului este " + apartament.numarApartament;
    }

    public static class comparatorByName implements Comparator<Locatar> {
        public int compare(Locatar o1, Locatar o2) {
            return o1.numeLocatar.compareTo(o2.numeLocatar);
        }
    }

    public static class comparatorByNumarApartament implements Comparator<Locatar> {
        public int compare(Locatar o1, Locatar o2) {
            return o1.apartament.compareTo(o2.apartament);
        }
    }
}
