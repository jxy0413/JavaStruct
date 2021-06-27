package jianzhioffermeituan;

/**
 * @author jiaxiangyu
 * @date 2021/6/27 6:54 下午
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class jianzhi13 {
  public int[] reOrderArray (int[] array) {
    // write code here
    int count = 0;
    int index = 0;
    while (index < array.length){
      if((array[index]&1) ==1){
        if(count!=index){ //前面有偶数
           int temp = array[index];
           for(int i=index;i>count;i--){
             array[i] = array[i-1];
           }
           array[count] = temp;
        }
        count++;
      }
      index++;
    }
    return array;
  }
}
