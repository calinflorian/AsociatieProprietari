import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asociatie implements Serializable {
    private static final long serialVersionUID = -6918935645332363656L;
    List<Apartament> apartament;


    public Asociatie(List<Apartament> apartament) {
        this.apartament = apartament;
    }

    public String toString() {
        return "" + apartament;
    }

    public ArrayList<Locatar> getAllLocatariByName() {
        ArrayList<Locatar> tempLocatari = new ArrayList<Locatar>();
        for (Apartament ap : apartament) {
            tempLocatari.addAll(ap.getLocatari());
        }
        Collections.sort(tempLocatari, new Locatar.comparatorByName());
        return tempLocatari;
    }

    public ArrayList<Locatar> getAllLocatariByAp() {
        ArrayList<Locatar> tempLocatari = new ArrayList<Locatar>();
        for (Apartament ap : apartament) {
            tempLocatari.addAll(ap.getLocatari());
        }
        Collections.sort(tempLocatari, new Locatar.comparatorByNumarApartament());
        return tempLocatari;
    }

    public void registerLocatarToApartament(List<Locatar> locatar, List<Apartament> apartament) {
    }

    public void save() {
        String filename = "C:\\Users\\calinf\\Desktop\\output.txt";

        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(this);

            out.close();
            file.close();

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }
}
