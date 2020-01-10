package kaoshi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by jxy on 2020/1/3.
 */
public class client {
    public static void main(String[] args) {
        try {
            Socket socket2 = new Socket("localhost",100);
            PrintWriter out2 = new PrintWriter(socket2.getOutputStream());
            BufferedReader in2 = new BufferedReader(new InputStreamReader(socket2.getInputStream()));

            System.out.println("localhost "+socket2.getInetAddress()+"已经连接");
            for(int i=1;i<5;i++){
                System.out.println("发送的是client "+i);
                out2.flush();
                String s = in2.readLine();
                System.out.println(s);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
