package kaoshi;

import javax.activation.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jxy on 2020/1/3.
 */
public class servcer {
    public static void main(String[] args) {
        try {
            ServerSocket sever = new ServerSocket(100);

            Socket socket1 = sever.accept();

            BufferedReader in1 = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
            PrintWriter out1 = new PrintWriter(socket1.getOutputStream());

            String clientNum;
            System.out.println("收到一个服务请求 "+socket1.getInetAddress());

            while (true){
                clientNum=in1.readLine();
                if(clientNum==null||clientNum.equals("")){
                    return;
                }
                System.out.println("客户端请求的服务是 "+clientNum);

                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String time = sdf.format(date);

                System.out.println("客户端响应的是 hello"+clientNum+"！"+time);
                out1.println("接受服务响应的时间"+clientNum+"!"+time);
                out1.flush();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
