package jianzhiOffer;

/**
 * @Auther jxy
 * @Date 2020-05-24
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 * 链接：https://www.nowcoder.com/questionTerminal/8ee967e43c2c4ec193b040ea7fbb10b8?f=discussion
 * 来源：牛客网
 * 如果一个整数不为0，那么这个整数至少有一位是1。如果我们把这个整数减1，那么原来处在整数最右边的1就会变为0，
 * 原来在1后面的所有的0都会变成1(如果最右边的1后面还有0的话)。其余所有位将不会受到影响。
 */
public class test10 {
    public static void main(String[] args) {
        int i = NumberOf1(5);
        System.out.println(i);
    }
    public static int NumberOf1(int n){
        int count = 0;
        while(n!=0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
