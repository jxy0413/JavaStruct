package yuhuihui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jxy on 2019/12/31.
 * 实现一个程序，对用户的连续输入，给出相应的输出。具体细节请参看下面的描述：
 古罗马有一个残酷的杀死犯人的游戏。若干个犯人站成一圈，现任意处死一个犯人，然后从被杀死的犯人开始，以某个固定的步长数数，被数到的犯人就被处死。这个过程一直持续下去，一直到只剩下一个犯人为止。
 但为了使题目更精彩，我们增加了一个新的规定：为了纪念被处死的犯人，每处死一个犯人后，他/她的号就会被增加到步长上去。
 给你犯人总数、第一个被处死的犯人号、以及初始步长，你能用Java程序预测哪个犯人最终幸运地活下来吗？
 */
public class FanRenExperiment {
    public static void main(String[] args) {
        while (true){
            sharenAction sharenAction = new sharenAction();
            expriment(sharenAction);
        }
    }

    public static void expriment(sharenAction action) {
        System.out.println("请输入：犯人总数 起始犯人号 初始步长");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //退出
        if ("finish".equals(line)) {
            System.exit(0);
        }
        String[] numbers = line.split(" ");

        int totalNumber = Integer.parseInt(numbers[0]);
        int initPos = Integer.parseInt(numbers[1]);
        int initStep = Integer.parseInt(numbers[2]);

        action.initData(totalNumber,initPos,initStep);
        action.excute();
        int survival = action.getSurvival();
        System.out.println("逃生犯人是"+survival+"号");
        System.out.println();
    }
}
interface sharen{
    void initData(int totalNumber,int initPos,int initStep); //数据初始化

    void excute(); //开始杀人

    int getSurvival(); //返回生存下来的犯人序号
}

class sharenAction implements sharen{
    int [] data; //存放现有犯人的序号
    int currPos; //下一个被处死的人位置
    int currStep; //存在下一个人步长
    int currNumber; //总人数

    @Override
    public void initData(int totalNumber, int initPos, int initStep) {
        this.currNumber = totalNumber;
        this.currPos= initPos;
        this.currStep=initStep;
        data = new int[totalNumber];
        for(int i=0;i<totalNumber;i++){
            data[i]=i;
        }
    }

    @Override
    public void excute() {
        //只要还有人的时候
        while (currNumber>1){
         currStep += data[currPos];
            //如果找到的话
            for(int i=currPos;i<currNumber-1;i++){
                data[i]=data[i+1];
            }
            //每次都减一
            currNumber--;
            currPos = ((currStep-1)%currNumber+currPos) % currNumber;
        }
    }

    @Override
    public int getSurvival() {
        return data[0];
    }
}