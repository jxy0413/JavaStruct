package nio;

import java.io.RandomAccessFile;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;

/**
 * @author jiaxiangyu
 * @date 2021/9/9 5:34 下午
 */
public class FileChannelDemo3 {



  //transferFrom
  public static void main(String[] args) throws Exception{
    //创建fileChannel
    RandomAccessFile aFile = new RandomAccessFile("/Users/jxy/Desktop/5.txt", "rw");
    FileChannel fromChannel = aFile.getChannel();

    //创建fileChannel
    RandomAccessFile bFile = new RandomAccessFile("/Users/jxy/Desktop/5.txt", "rw");
    FileChannel toChannel = aFile.getChannel();

    //通到过程
    toChannel.transferFrom(fromChannel,0, fromChannel.size());

    aFile.close();
    bFile.close();
    System.out.println("Over");

  }
}
