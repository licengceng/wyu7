package Sep_15作业;

public class Dog extends Animal{
    int eyes;

    public Dog(){}
    public Dog(int eyes,int legs){
        this.eyes=eyes;
        this.legs=legs;
    }
    public Dog(int legs){
        super(legs);
    }
    public void work(){
        System.out.println("正在看家");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(2,4);
        System.out.print(dog1.eyes+"只大眼睛"+dog1.legs+"条腿的狗");
        dog1.work();


        Dog dog2 = new Dog();
        dog2.eat("骨头");
        dog2.eat(2,"块骨头");

    }
}
