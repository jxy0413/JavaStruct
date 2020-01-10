package hashtab;

import java.util.Scanner;

/**
 * Created by jxy on 2019/11/28.
 */
public class HashTabDemo {
    public static void main(String[] args) {
        //创建哈希表
        HashTab hashTab = new HashTab(7);

        //写一个简单的菜单
        String key = "";
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("add 添加雇员");
            System.out.println("list 显示雇员");
            System.out.println("find 查找雇员");
            System.out.println("exit 退出系统");

            key = scanner.next();

            switch (key){
                case "add":
                    System.out.println("输入id ");
                    int id = scanner.nextInt();
                    System.out.println("输入姓名 ");
                    String name =scanner.next();
                    //创建雇员
                    Emp emp = new Emp(id,name);
                    hashTab.add(emp);
                    break;
                case "list":
                    hashTab.list();
                    break;
                case "find":
                    System.out.println("请输入要查找的id");
                    id=scanner.nextInt();
                    hashTab.findEmpById(id);
                    break;
                case "exit":
                    scanner.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
//表示一个雇员
class Emp{
    public int id;
    public String name;
    public Emp next; //next 默认为null

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

//创建HashTab 管理多条链表
class HashTab{
    private EmpLinkedList[] empLinkedListArray;

    private int size; //表示有多少条链表

    //构造器
    public HashTab(int size){
        this.size=size;
        //初始化EmpLinkedListArray
        empLinkedListArray = new EmpLinkedList[size];
        //还要初始化里面的链表
        for(int i=0;i<size;i++){
            empLinkedListArray[i]=new EmpLinkedList();
        }
    }

    //添加雇员
    public void add(Emp emp){
        //根据员工id 得到员工应该插入哪条链
        int empLinkedListNo = hashFun(emp.id);

        empLinkedListArray[empLinkedListNo].add(emp);
    }

    /**
     * 遍历所有的链表
     */
    public void list(){
        for(int i=0;i<size;i++){
            empLinkedListArray[i].list(i);
        }
    }

    /**
     * 根据输入的id 查找雇员
     * @param id
     */
    public void findEmpById(int id){
       //根据散列情况决定是哪条
        int empListNo = hashFun(id);
        Emp empById = empLinkedListArray[empListNo].findEmpById(id);
        if(empById!=null){
            System.out.println("在第"+(empListNo+1)+"中找到雇员 ");
        }else{
            System.out.println("在哈希表中,没有找到该雇员!");
        }
    }


    //编写简单函数 使用一个简单的取模法
    public int hashFun(int n){
        return n%size;
    }

}

//创建EmpLinkedList表示链表
class EmpLinkedList{
    //头指针 执行一个emp 因此我们这个链表 是直接指向第一个Emp
    private Emp head; //默认为null

    /**
     * 添加雇员到链表
     * @param emp
     */
    public void add(Emp emp){
        //如果添加的是第一个雇员的话
        if(head==null){
            head=emp;
            return;
        }
        //如果添加的不是一个雇员的话
        Emp curEmp = head;
        while(true){
            if(curEmp.next==null){
                break;
            }
            curEmp = curEmp.next;
        }
        //直接退出时将emp加入到链表
        curEmp.next = emp;
    }

    /**
     * 遍历 链表的雇员信息
     * @param no
     */
    public void list(int no){
       if(head==null){
           System.out.println("第 "+(no+1)+" 链表为空");
           return;
       }
        System.out.print("第"+(no+1)+"链表为：");
        Emp curEmp = head; //辅助指针
        while (true){
            System.out.printf(" =>id=%d name=%s\t",curEmp.id,curEmp.name);
            if(curEmp.next==null){
                break;
            }
            curEmp = curEmp.next;
        }
        System.out.println();
    }

    /**
     * 根据id 查找雇员
     * @param id
     * @return 如果查到 则返回Emp 如果没有找到 则返回null
     */
    public Emp findEmpById(int id){
         //先判断链表是否为空
        if(head==null){
            System.out.println("链表为空");
            return null;
        }
        //辅助指针
        Emp curEmp = head;
        while (true){
            if(curEmp.id==id){
                break;
            }
            if(curEmp.next==null){
                curEmp=null;
                break;
            }
            curEmp=curEmp.next;
        }
        return curEmp;  //返回有值 或者Null
    }
}