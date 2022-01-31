package changkao;

/**
 * @author jiaxiangyu
 * @date 2021/8/20 6:57 下午
 */
public class YHSJ {
  public static void main(String[] args) {
     print(10);
  }

  public static void print(int num){
    int arr [][] = new int[num][num];

    for(int i=0;i<num;i++){
       for(int j=0;j<=i;j++){
          if(j==0 || j==i){
            arr[i][j] = 1;
          }else{
            arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
          }
         System.out.print(arr[i][j] + "\t");
       }
      System.out.println();
    }
  }
}

