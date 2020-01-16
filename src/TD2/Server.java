package TD2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){

        int port = 666;

        try {
            ServerSocket conn = new ServerSocket(port);
            Socket sock = conn.accept();
            System.out.println("connected");
            InputStream in = sock.getInputStream();
            OutputStream out = sock.getOutputStream();
            BufferedReader buff = new BufferedReader(new InputStreamReader(in));

            String l = buff.readLine();
            while (l != null){
                System.out.println(l);
                l = buff.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
