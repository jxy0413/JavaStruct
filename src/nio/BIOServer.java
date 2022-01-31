package nio;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author jiaxiangyu
 * @date 2021/8/19 4:20 下午
 */
public class BIOServer {

  public static void main(String[] args) throws Exception{
    ExecutorService executorService = Executors.newCachedThreadPool();
    //创建ServerSocket
    ServerSocket serverSocket = new ServerSocket(7777);
    System.out.println("服务器启动了。。。。");
    while (true){
      System.out.println("线程信息id = " + Thread.currentThread().getId() + "名字 = " + Thread.currentThread().getName());
      //等到监听
      System.out.println("等待链接。。。。");
      final Socket socket = serverSocket.accept();
      System.out.println("链接到一个客户端");
      executorService.execute(new Runnable() {
        @Override
        public void run() {
          try {
            handler(socket);
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      });
    }
  }


  public static void handler(Socket socket)throws Exception{
    System.out.println("线程信息id = " + Thread.currentThread().getId() + "名字 = " + Thread.currentThread().getName());
    byte [] bytes = new byte[1024];
    InputStream inputStream = socket.getInputStream();
    while (true){
      System.out.println("线程信息id = " + Thread.currentThread().getId() + "名字 = " + Thread.currentThread().getName());
      System.out.println("read....");
      int read = inputStream.read(bytes);
      if(read != -1){
        //输出客户端发送的数据
        System.out.println(new String(bytes, 0, read));
      }else{
        break;
      }
    }
  }
}
