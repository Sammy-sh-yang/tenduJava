package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Client {

    //客戶端鏈接服務端
    // Socket 封裝，可以理解爲電話
    private Socket socket;

    //Client name
    private static String username;

    //初始化客戶端
    public Client() {
        System.out.println("Connecting port 8088 server");

        // 如果報錯表示 port 沒被佔用
        try {
            socket = new Socket("localhost", 8088);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //客戶端開始工作方法
    public void start() {
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bufferedWriter, true);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String line = scanner.nextLine();
                if ("exit".equals(line)) {
                    break;
                }
                pw.println(username + ": " + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //沒有邏輯，控制流程
    public static void main(String[] args) {

        String[] name = new String[]{"Sammy", "Prisca", "Peter", "Halo"};
        Random ran = new Random();
        int num = ran.nextInt(name.length);

        //random username
        username = name[num];

        Client client = new Client();
        client.start();
    }
}
