package nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.RandomAccess;

/**
 * @author jiaxiangyu
 * @date 2021/9/9 5:04 下午
 */
public class FileChannelDemo {
  //通过FileChannel读取buffer中
  public static void main(String[] args) throws Exception{
     //创建fileChannel
    RandomAccessFile aFile = new RandomAccessFile("/Users/jxy/Desktop/5.txt", "rw");
    FileChannel channel = aFile.getChannel();

    System.out.println(channel.size());
    //创建Buffer
    ByteBuffer buf = ByteBuffer.allocate(10);

    int bytesRead = channel.read(buf);

    while (bytesRead != -1){
      System.out.println("读取了 "+bytesRead);
      buf.flip();
      while (buf.hasRemaining()){
        System.out.println((char)buf.get());
      }
      buf.clear();
      bytesRead = channel.read(buf);
    }
    aFile.close();
    System.out.println("结束了。。。");
  }
}
