package jianzhi;

import java.util.HashSet;

public class jianzhi40 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
           HashSet<Integer> set = new HashSet();
           for (int i = 0;i < array.length;i++){
              if(!set.add(array[i])){
                set.remove(array[i]);
              }else{
                  set.add(array[i]);
              }
          }
        Object[] objects = set.toArray();
        num1[0] = (Integer) objects[0];
        num2[0] = (Integer) objects[1];
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }

    public static void main(String[] args) {
        jianzhi40 jianzhi40 = new jianzhi40();
        int arr[] = {2,4,3,6,3,2,5,5};
        int num1[] = new int[1];
        int num2[] =new int[1];
        jianzhi40.FindNumsAppearOnce(arr,num1,num2);
    }
}
