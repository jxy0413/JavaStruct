package huisu;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/11 16:02
 */
public class People {
    public static void main(String[] args) {
         Stu stu = new Stu("1","jia");
         add(stu);
    }
    
    public static void add(Object stu){
        for(Field field:stu.getClass().getDeclaredFields()){
            field.setAccessible(true);
            try {
                Object id = field.get("id");
                System.out.println(id);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
    
}

@NoArgsConstructor
@Data
class Stu{
    private String id;
    private String name;
    
    public Stu(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
