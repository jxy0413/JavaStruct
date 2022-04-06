package shejimoshi.chapter18;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 12:22 下午
 */
public class GameRole {
    private int vit;
    private int atk;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void stateDisplay(){
        System.out.println("当前角色状态： ");
        System.out.println("体力：" + vit);
        System.out.println("攻击力：" + atk);
        System.out.println("防御力：" + def);
    }

    public void getInitState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    //保存游戏状态
    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit, atk, def);
    }

    //恢复角色状态
    public void recoveryState(RoleStateMemento roleStateMemento){
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }
}
