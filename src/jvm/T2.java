package jvm;

public class T2 {
    /**
     * Xms Xmx 必须设置成一样 否则会造成内存抖动
     * @param args
     */
    public static void main(String[] args) {
        byte b[] = new byte[1024*1024*1024];
        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("-Xmx:MAX_MEMORY = " + maxMemory+"(字节） "+(maxMemory/(double)1024/1024)+"MB");
        System.out.println("-Xms:MAX_MEMORY = " + totalMemory+"(字节） "+(totalMemory/(double)1024/1024)+"MB");
    }
}
