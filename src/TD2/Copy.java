package TD2;

import java.io.*;

public class Copy {
    private static void copy(InputStream in, OutputStream out) throws IOException {

        int octet = in.read();

        while(octet != -1){
            out.write(octet);
            octet = in.read();
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream is;
        OutputStream os;
        try{
            switch (args.length){
                case 0:
                    is = System.in;
                    os = System.out;
                    break;
                case 1:
                    is = new FileInputStream(new File(args[0]));
                    os = System.out;
                    break;
                case 2:
                    is = new FileInputStream(new File(args[0]));
                    os = new FileOutputStream(new File(args[1]));
                    break;
                default:
                    is = new FileInputStream(new File(args[0]));
                    os = new FileOutputStream(new File(args[1]));
                    System.err.println("Warning! too much args");
                    System.err.println("usage java copy source.txt cible.txt");
            }

            copy(is, os);
            is.close();
            os.close();
        } catch(FileNotFoundException e){
            System.err.println("File not found");
        }catch (IOException e){
            System.err.println("Err, IO exception"+ e);
        }


    }
}
