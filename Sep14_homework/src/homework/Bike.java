package homework;

/**
 * @author LWQ
 * @title: Bike
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1611:33
 */
public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("踩自行车");
    }

    @Override
    public void stop() {
        System.out.println("停自行车");
    }
}
