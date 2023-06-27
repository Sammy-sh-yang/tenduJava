package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SS {
    ServerSocket server;

    public SS() {
        try {
            server = new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start (){
        while (true) {
            try {
                Socket socket = server.accept();


                InputStream input = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(input);
                BufferedReader br = new BufferedReader(isr);
                String line = br.readLine();

                System.out.println(line);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SS server = new SS();
        server.start();

    }

}
