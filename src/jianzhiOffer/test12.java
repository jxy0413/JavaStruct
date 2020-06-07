package jianzhiOffer;

/**
 * @Auther jxy
 * @Date 2020-05-27
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 *整体思路：
 *首先统计奇数的个数
 *然后新建一个等长数组，设置两个指针，奇数指针从0开始 偶数指针从奇数个数的末尾开始
 */
public class test12 {
    public void reOrderArray (int [] array){
        if(array.length==0||array.length==1){
            return;
        }
        int oddCount = 0;
        int oddBegin = 0;
        int [] newArray = new int [array.length];

        //找到偶数指针的位置
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1){
                oddCount++;
            }
        }

        //开始遍历
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1){
                newArray[oddBegin++]=array[i];
            }else{
                newArray[oddCount++]=array[i];
            }
        }

        //最后还原新的将newArray会退到新的
        for(int i=0;i<array.length;i++){
            array[i]=newArray[i];
        }

    }
}
