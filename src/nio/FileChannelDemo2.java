package nio;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.RandomAccess;

/**
 * @author jiaxiangyu
 * @date 2021/9/9 5:22 下午
 */
public class FileChannelDemo2 {

  public static void main(String[] args) throws Exception{
    //打开
    RandomAccessFile aFile = new RandomAccessFile("/Users/jxy/Desktop/5.txt", "rw");
    FileChannel channel = aFile.getChannel();

    //创建对象
    ByteBuffer buffer = ByteBuffer.allocate(1024);
    String newData = "data jia";
    buffer.clear();
    //写入内容
    buffer.put(newData.getBytes(StandardCharsets.UTF_8));
    buffer.flip();

    while (buffer.hasRemaining()){
      channel.write(buffer);
    }

    System.out.println("完成了。。。。");
    channel.close();
  }
}
