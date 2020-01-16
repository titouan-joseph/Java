package TD2;

import java.io.IOException;

public class get_stdin_to_stdout {
    public static void main(String[] args) throws IOException {
        System.out.println("Entrez un caractère");
        int inChar = System.in.read();
        System.out.println("Vous avez saisi: "+inChar);
    }
}