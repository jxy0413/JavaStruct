package jianzhi;

public class jianzhi6 {
    public static int minNumberInRotateArray(int [] array){
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] array = {6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,633};
        System.out.println(minNumberInRotateArray(array));
    }
}
