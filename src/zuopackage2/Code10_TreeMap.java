package zuopackage2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Code10_TreeMap {
    public ArrayList<Integer> getLeastNumber_solution(int arr[], int k){
          ArrayList<Integer> list = new ArrayList<>();
          if(arr.length==0||arr.length<k||k<=0){
              return list;
          }
          TreeSet<Integer> set = new TreeSet();
          for(int i=0;i<arr.length;i++){
             if(set.size()<k){
                 set.add(arr[i]);
             }else if(arr[i]<set.last()){
                 set.remove(set.last());
                 set.add(arr[i]);
             }
          }
         Iterator<Integer> iterator = set.iterator();
          while (iterator.hasNext()){
              list.add(iterator.next());
          }
          return list;
    }
}
