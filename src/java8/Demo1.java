package java8;

import org.junit.Test;

import java.util.*;

/**
 * @author jiaxiangyu
 * @date 2022/12/4 10:06 下午
 */
public class Demo1 {
   /**
    *
    */
   @Test
   public void test(){
      Comparator<Integer> com = new Comparator<Integer>() {
         @Override
         public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
         }
      };


      Set<Integer> set = new TreeSet(com);
   }

   @Test
   public void test2(){
      Comparator<Integer> com = Integer::compare;
   }

   @Test
   public void test3(){
      List<Employee> list = Arrays.asList(
              new Employee("zhangsan", 18, 999.0),new Employee("lisi", 28, 999.0)
      );
      List<Employee> employees = filterEmployees(list);
      employees.forEach(System.out::println);

      //策略设计模式
      List<Employee> employees1 = filterEmployees1(employees, new FiilterMyPredicate());
      employees1.forEach(System.out::println);

     //优化方式3 匿名内部类
     filterEmployees1(employees, new MyPredicate<Employee>() {
        @Override
        public Boolean filter(Employee employee) {
           return employee.getAge() > 13;
        }
     });

     //优化方式4：Lambda表达式
      List<Employee> employees2 = filterEmployees1(employees, (e) -> e.getSalary() < 10);
      employees.forEach(System.out::println);

      //优化方式5：
      employees.stream().
              filter((e) -> e.getSalary() > 500).
              forEach(System.out::println);

   }

   public List<Employee> filterEmployees(List<Employee> list){
      List<Employee> emps = new ArrayList<>();
      for(Employee employee : list){
         if(employee.getAge() > 1){
            emps.add(employee);
         }
      }
      return emps;
   }

   public List<Employee> filterEmployees1(List<Employee> list,  MyPredicate<Employee> mp){
      List<Employee> emps = new ArrayList<>();
      for(Employee employee : list){
        mp.filter(employee);
      }
      return emps;
   }



}
