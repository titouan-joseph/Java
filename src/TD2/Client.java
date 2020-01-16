package TD2;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        int port = 666;

        Socket sock = new Socket("localhost", port);
        InputStream in = sock.getInputStream();
        OutputStream out = sock.getOutputStream();
        BufferedReader buff = new BufferedReader(new InputStreamReader(in));
        PrintWriter p = new PrintWriter(out, true );

        String l = buff.readLine();
        while (l != null){
            System.out.println(l);
            p.println(l);
            l = buff.readLine();

        }
    }
}
