package homework;

/**
 * @author LWQ
 * @title: Bus
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1611:34
 */
public class Bus implements Vehicle{
    @Override
    public void start() {
        System.out.println("公交车启动");
    }

    @Override
    public void stop() {
        System.out.println("公交车停车");
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
        bike.stop();

        Bus bus = new Bus();
        bus.start();
        bus.stop();
    }
}
