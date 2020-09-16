package homework;


public class Student {
    public Student(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private String name;

    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void listen() {
        System.out.println(name + "在教室听课");
    }
}
