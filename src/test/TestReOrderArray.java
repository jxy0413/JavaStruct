package test;

public class TestReOrderArray {
    public static void main(String[] args) {
       int arr[] ={1,2,3,4,5,6,7};

       for(int i=0;i<arr.length;i++){
           if(arr[i]%2==1){
               System.out.println(arr[i]);
           }
       }
        System.out.println("*************************");
        for(int i=0;i<arr.length;i++){
            if((arr[i]&1)==1){
                System.out.println(arr[i]);
            }
        }
    }
}
