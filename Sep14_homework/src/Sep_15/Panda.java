package Sep_15;

/**
 * @author LWQ
 * @title: Panda
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1514:59
 */
public class Panda extends Animal{

    public Panda(){}
    public Panda(int legs){
        super(legs);
    }
    public void climb(){
        System.out.println("正在爬树..");
    }

    public void eat(){
        System.out.println("子类eating...");
    }

    public static void main(String[] args) {
        new Animal().eat();
        Animal a1 = (Animal) new Panda();
        Panda p1= (Panda) a1;
        a1.eat();
        p1.eat();

        Panda panda1 = new Panda(4);
        System.out.print(panda1.legs+"条腿的熊猫");
        panda1.climb();
    }
}
