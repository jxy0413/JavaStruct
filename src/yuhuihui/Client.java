package yuhuihui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by jxy on 2020/1/1.
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket2 = new Socket("localhost",100);
            PrintWriter out2 = new PrintWriter(socket2.getOutputStream());
            BufferedReader in2 = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
            System.out.println("localhost "+socket2.getLocalPort()+"connected...");

            for(int i=1;i<5;i++){
                System.out.println("发送的请求是 ： Client"+i);
                out2.println("发送的请求 Client"+String.valueOf(i));
                out2.flush();
                String s = in2.readLine();
                System.out.println(s);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            out2.close();
            in2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
