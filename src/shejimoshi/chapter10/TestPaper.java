package shejimoshi.chapter10;

/**
 * @author jiaxiangyu
 * @date 2022/4/3 12:35 下午
 */
public abstract class TestPaper {

    protected abstract String answer1();

    public void testQuestion1(){
        System.out.println("杨过得到，后来给了郭靖？ a.球 b.马口铁 c.高速合金");
        System.out.println("答案是 ： " + answer1());
    }

    protected abstract String answer2();

    public void testQuestion2(){
        System.out.println("蓝凤凰，会开什么药？ a.阿司匹林 b.牛黄解毒片 c.以上都不对");
        System.out.println("答案是 ： " + answer2());
    }
}
