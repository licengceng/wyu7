package Sep_15;

/**
 * @author LWQ
 * @title: Animal
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1514:56
 */
public class Animal {
    private String name;
     int legs;
    public Animal(){}
    public Animal(int legs){
        this.legs=legs;
    }
    public void eat(){
        System.out.println("父类eating...");
    }

    public void eat(String thing){
        System.out.println("正在吃"+thing);
    }

    public void eat(int thing,String food){
        System.out.println("在吃"+thing+food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
