import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Apartament implements Comparable<Apartament> , Serializable {

    private static final long serialVersionUID = -6837644532816993124L;
    int numarDeCamere;
    List<Locatar> locatari;
    int numarApartament;


    public Apartament(int numarDeCamere, int numarApartament) {
        this.numarDeCamere = numarDeCamere;
        this.locatari = new ArrayList<Locatar>();
        this.numarApartament = numarApartament;
    }

    @Override
    public String toString() {
        return "Apartamentul cu numarul " + numarApartament + ", are " + numarDeCamere + " camere.";
    }

    public List<Locatar> getLocatari() {
        return locatari;
    }

    public void addLocatar(Locatar locatar) {
        if (locatar != null && locatari != null) {
            locatari.add(locatar);
        }
    }

    public void removeLocatar(Locatar locatar) {
        if (locatar != null && locatari != null) {
            locatari.remove(locatar);
        }
    }


    public int compareTo(Apartament o) {
        return this.numarApartament - o.numarApartament;
    }
}
