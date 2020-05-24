package jianzhiOffer;

/**
 * @Auther jxy
 * @Date 2020-05-24
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class test09 {
    public static void main(String[] args) {
        int i = RectCover(4);
        System.out.println(i);
    }

    public static int RectCover(int target){
        if(target<1){
            return 0;
        }
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        return RectCover(target-1)+RectCover(target-2);
    }
}
