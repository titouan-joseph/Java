package TD2;

import java.io.*;

public class LireMessage {
    public static void main(String args[]) {
        if (args.length < 1) {
            System.out.println("usage: java LireMessage <dest>");
        } else {

            try {

                File dest = new File(args[0]);
                FileInputStream fin = new FileInputStream(dest);
                ObjectInputStream oin = new ObjectInputStream(fin);

                Object stdout = oin.readObject();
                System.out.println(stdout);

                oin.close();
                fin.close();


            } catch (FileNotFoundException e) {
                System.err.println("ERR: Le fichier source n'existe pas ou le fichier de destination ne peut être crée ou ouvert.");
            } catch (IOException e) {
                System.err.println("ERR: entrée/sortie.");

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                System.out.println("END");
            }
        }
    }
}