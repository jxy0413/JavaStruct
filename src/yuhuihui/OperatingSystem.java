package yuhuihui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by jxy on 2020/1/1.
 */
public class OperatingSystem{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入命令");
        OS operater = new OS();
        operater.setArrayList();
        while (sc.hasNext()) {
            String order = sc.next();
            if (order.equals("help")) // 如果用户的一行输入是“finish”，则程序全部退出。
                operater.help();
            else if (order.equals("finish"))
                operater.finish();
            else if (order.equals("clear"))
                operater.clear();
            else if (order.equals("isEmpty"))
                operater.isEmpty();
            else if (order.equals("size"))
                operater.size();
            else if (order.equals("iterator"))
                operater.iterator();
            else if (order.equals("add_last")) {
                Integer n = sc.nextInt();
                operater.add_list(n);
            } else if (order.equals("contains")) {
                Integer n = sc.nextInt();
                operater.contain(n);
            } else if (order.equals("get")) {
                int n = sc.nextInt();
                Integer N;
                N = operater.get(n);
                if (N >= 0)
                    System.out.println("得到 " + N);
            } else if (order.equals("remove")) {
                int n = sc.nextInt();
                operater.remove(n);
            } else if (order.equals("set")) {
                int n = sc.nextInt();
                Integer data = sc.nextInt();
                operater.set(n, data);
            } else if (order.equals("add_any")) {
                int n = sc.nextInt();
                Integer data = sc.nextInt();
                operater.add_any(n, data);
            } else
                System.out.println("请输入正确的命令，详情请输入 help");
        }
        sc.close();
    }

}
class OS{
    ArrayList<Integer> list = new ArrayList();

    public OS(){

    }

    public void setArrayList() {
        for (int i = 0; i < 10; i++)
            list.add(i);
    }

    public void help(){
        System.out.println("(1)help 没有参数 提示用户");
        System.out.println("(2)finish -不带参数 程序退出");
        System.out.println("(3)clear -不带参数 清空数据程序");
        System.out.println("(4)isEmpty-不带参数 返回数据列表为空的信息");
        System.out.println("(5) size — 不带参数。返回当前数据列表的元素数目");
        System.out.println("(6) iterator — 不带参数。遍历当前数据列表");
        System.out.println("(7) add_last — 一个参数。把所带的参数追加到。遍历当前数据列表\");数据列表最后");
        System.out.println("(8) contains — 一个参数。查看列表中是否含有所给的参数");
        System.out.println("(9) get — 一个参数。查看列表中的相应位置上的数据并返回。这个参数不能小于0，也不能大于或等于size");
        System.out.println("(10) remove — 一个参数。删除列表中相应位置上的信息。这个参数不能小于0，也不能大于或等于size");
        System.out.println("(11) set — 两个参数，第一个参数是位置，第二个参数是数据。把相应的位置上的数据置换成给定的第二个参数");
        System.out.println("(12) add_any — 两个参数，在某个位置上插入一个新数据");
    }

    public void finish(){
        System.exit(0);
    }

    public void clear(){
        list.clear();
        System.out.println("数据以空");
    }

    public boolean isEmpty(){
        if(list==null||list.size()==0){
            System.out.println("数据为空");
        }else{
            System.out.println("数据不为空");
        }
        return list.isEmpty();
    }

    public int size(){
        System.out.println("数据表的size为 "+list.size());
        return list.size();
    }

    public void iterator(){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void add_list(int n){
        list.add(n);
        System.out.println("数据"+n+"已经添加");
    }

    public void contain(int n){
        if(list.contains(n)){
            System.out.println("数据中包含"+n);
        }else{
            System.out.println("数据中不包含"+n);
        }
    }

    public Integer get(int n){
        if(n<0 || n>list.size()-1){
            int size = list.size()-1;
            System.out.println("请输入0至"+size+"的区间");
            return -1;
        }else
            return list.get(n);
    }

    public void remove(int n){
        if(n<0 || n>list.size()-1){
            int size = list.size()-1;
            System.out.println("请输入0至"+size+"的区间");
        }else
            list.remove(n);
            System.out.println("已经成功删除下标为"+n+"的数");
    }

    public void set(int n,Integer data){
        if(n<0 || n>list.size()-1){
            int size = list.size()-1;
            System.out.println("请输入0至"+size+"的区间");
        }else{
            list.set(n,data);
            System.out.println("已经将"+data+"插入到"+n+"的位置");
        }
    }

    public void add_any(int n,Integer data){
        if(n<0 || n>list.size()-1){
            int size = list.size()-1;
            System.out.println("请输入0至"+size+"的区间");
        }else{
            list.add(n,data);
            System.out.println("已经将"+data+"插入到"+n+"的位置");
        }
    }
}