package changkao;

/**
 * @author jiaxiangyu
 * @date 2021/8/19 8:20 下午
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1
 1 5 10 10 5 1
 */
public class Test {
   public static void print(int num){
     int arr [][] = new int[num][num];
     if(num == 1){
       System.out.println("1");
     }

     if(num == 2){
       arr[0][0] = 1;
       arr[1][0] = 1;
       arr[1][1] = 1;
     }


     if(num>2){
       for(int i=1; i<= num ; i++){
         for(int j=1;j <=num ;j++){
           arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
           arr[i][0] = 1;
           arr[i][num] = 1;
         }
       }
       arr[0][0] = 1;
     }


     for(int [] k : arr){
        for(int m :k){
          System.out.print(m+" ");
        }
        System.out.println();
     }

   }

  public static void main(String[] args) {
     print(2);
  }
}
