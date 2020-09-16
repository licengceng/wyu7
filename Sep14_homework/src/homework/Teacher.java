package homework;

/**
 * @author LWQ
 * @title: Teacher
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1411:29
 */
public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void teach() {
        System.out.println(name + "在教室上课");
    }
    public void teach(Student student) {
        System.out.println(name + "在教室对"+student.getAge()+"的"+student.getName()+"进行教学");
    }
}
