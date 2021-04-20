package shejimoshi.principle;

/**
 * Created by jxy on 2021/4/20 0020 17:59
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehice roadVehice = new RoadVehice();
        roadVehice.run("摩托车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("游艇");
    }
}
//方案2的分析
//1.遵守单一职责原则
//2.但是这样做的改动很大，即要将类分解，同时修改客户端
//
class RoadVehice{
    public void run(String vehicle){
        System.out.println(vehicle + "公路运行");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "空中运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "水中运行");
    }
}