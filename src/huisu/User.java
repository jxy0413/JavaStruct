package huisu;

/**
 * @Author jiaxiangyu
 * @Date 2021/3/11 16:01
 */
public class User {
    private int id;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public User(int id){
        this.id = id;
    }
    
    public void uid(){
        System.out.println("hhhhhh");
    }
}
