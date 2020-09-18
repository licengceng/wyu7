package Sep_15作业.com.homework;

/**
 * @author LWQ
 * @title: Person
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1611:45
 */
public class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
