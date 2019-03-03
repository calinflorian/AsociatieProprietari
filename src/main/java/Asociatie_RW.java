import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Asociatie_RW {
    public static void main(String[] args) {

        Asociatie asociatie1 = null;
        String filename = "C:\\Users\\calinf\\Desktop\\output.txt";

        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            asociatie1 = (Asociatie) in.readObject();

            in.close();
            file.close();
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundExeption is caught");
        }
        System.out.println(asociatie1.getAllLocatariByAp());
        System.out.println(asociatie1.getAllLocatariByName());
    }
}