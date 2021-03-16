package huisu;

import java.lang.reflect.Field;
import java.util.Date;
import lombok.Data;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/12 15:26
 */
public class ReflectfieldTest {
    public static void main(String[] args) {
          Student student = new Student();
          student.setId(1L);
          student.setName("jia");
        try {
            System.out.println(student);
            Field id = student.getClass().getDeclaredField("id");
            id.setAccessible(true);
            try {
                Object o = id.get(student);
                System.out.println(o);
                System.out.println(id.get(student));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
class Student{
    private Long id;
    private String name;
    private Date createdate;
    private String no;
    private String nickName;
    
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdate=" + createdate +
                ", no='" + no + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Date getCreatedate() {
        return createdate;
    }
    
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    
    public String getNo() {
        return no;
    }
    
    public void setNo(String no) {
        this.no = no;
    }
    
    public String getNickName() {
        return nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}