package tanxin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SweetChild {
    public static int findContentChildren(int child[],int cookie[]){
        Arrays.sort(child);
        Arrays.sort(cookie);
        int childCount = 0;
        int cookieCount= 0;
        while(childCount<child.length&&cookieCount<cookie.length){
            if(child[childCount]<=cookie[cookieCount]){
                childCount++;
                cookieCount++;
            }else{
                cookieCount++;
            }
        }
        return childCount;
    }

    public static void main(String[] args) {
        int [] child = {3,6,2,7,16};
        int [] cookie = {3,1,4,5,99};
        int contentChildren = findContentChildren(child, cookie);
        System.out.println(contentChildren);
    }
}
