package abstractfactory;

/**
 * 抽象工厂方法，针对一系统产品族提供抽象工厂,又具体生产这一系列的工厂去实现
 *
 * Created by jolly on 2017/4/23.
 */
public class Main {

    public static void main(String[] args) {


        VehicleFactory fawFact = new FawVehicleFactory();
        Vehicle busFaw = fawFact.getBus("busFAW","red");
        Vehicle carFaw = fawFact.getCar("carFAW","red");

        busFaw.travel();
        busFaw.whistle();

        carFaw.travel();
        carFaw.whistle();

        System.out.println("----------------------------------------------");

        VehicleFactory dfFact = new FawVehicleFactory();
        Vehicle busDf = dfFact.getBus("busDF","red");
        Vehicle carDf = dfFact.getCar("carDF","red");

        busDf.travel();
        busDf.whistle();

        carDf.travel();
        carDf.whistle();
    }
}
