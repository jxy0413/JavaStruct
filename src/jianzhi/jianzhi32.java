package jianzhi;

public class jianzhi32 {
    public String printMinNumber(int [] numbers){
        String str = "";
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int a = Integer.valueOf(numbers[i]+""+numbers[j]);
                int b = Integer.valueOf(numbers[j]+""+numbers[i]);
                if(a>b){
                    int t = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = t;
                }
            }
        }
       for(int i=0;i<numbers.length;i++){
           str+=String.valueOf(numbers[i]);
       }
       return str;
    }

    public static void main(String[] args) {
        jianzhi32 jianzhi32 = new jianzhi32();
        int arr[] = {3,32,321};
        System.out.println(jianzhi32.printMinNumber(arr));
    }
}
