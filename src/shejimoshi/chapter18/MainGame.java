package shejimoshi.chapter18;

/**
 * @author jiaxiangyu
 * @date 2022/4/5 12:41 下午
 */
public class MainGame {
    public static void main(String[] args) {
        //大战boss前
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();

        //保存进度
        RoleStateGameTaker stateAdmin = new RoleStateGameTaker();
        stateAdmin.setMemento(lixiaoyao.saveState());

        //大战boss时，损耗严重
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();

        //恢复之前的状态
        lixiaoyao.recoveryState(stateAdmin.getMemento());
        lixiaoyao.stateDisplay();
    }
}
