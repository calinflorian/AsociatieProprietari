import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Runner {

    private static final Logger LOGGER = Logger.getLogger(Runner.class.getName());
    public static void main(String[] args) throws IOException {

        Apartament apartament1 = new Apartament(3, 1);
        Apartament apartament2 = new Apartament(2, 2);
        Apartament apartament3 = new Apartament(5, 4);
        Apartament apartament4 = new Apartament(4, 7);

        Locatar locatar1 = new Locatar("Florian", apartament1);
        Locatar locatar2 = new Locatar("Costin", apartament2);
        Locatar locatar3 = new Locatar("Florin", apartament4);
        Locatar locatar4 = new Locatar("Costi", apartament3);

        apartament1.addLocatar(locatar1);
        apartament2.addLocatar(locatar2);
        apartament3.addLocatar(locatar3);
        apartament4.addLocatar(locatar4);

        ArrayList<Apartament> apartaments = new ArrayList<Apartament>();
        apartaments.add(apartament1);
        apartaments.add(apartament2);
        apartaments.add(apartament3);
        apartaments.add(apartament4);

        //System.out.println(apartament1.toString());
        //System.out.println(locatar1.toString());

        Asociatie asociatie = new Asociatie(apartaments);

        //LOGGER.info(String.valueOf(asociatie));
        //LOGGER.info(String.valueOf(asociatie.getAllLocatariByName()));
        //LOGGER.info(String.valueOf(asociatie.getAllLocatariByAp()));

        //System.out.println(asociatie.getAllLocatariByName());
        //System.out.println(asociatie.getAllLocatariByAp());

        System.out.println(asociatie.toString());
        System.out.println(String.valueOf(asociatie.getAllLocatariByName()));

        asociatie.save();



    }
}
