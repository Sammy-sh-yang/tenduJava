package test;

import java.io.*;
import java.net.Socket;

public class CC {

    Socket socket;

    public CC() {
        try {
            socket = new Socket("localhost", 8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            OutputStream output = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(output);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);
            pw.println("Hello World");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        CC client = new CC();
        client.start();
    }

}
