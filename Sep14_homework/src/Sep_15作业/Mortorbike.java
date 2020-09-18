package Sep_15作业;

/**
 * @author LWQ
 * @title: Mortorbike
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1611:24
 */
public class Mortorbike extends Vehicle {
    public void identifyNumberOfWheels(){
        System.out.println("这是双轮车");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.identifyNumberOfWheels();

        Mortorbike mortorbike = new Mortorbike();
        mortorbike.identifyNumberOfWheels();
    }
}
