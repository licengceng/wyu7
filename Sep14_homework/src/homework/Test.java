package homework;

public class Test {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("何老师");
        Student student = new Student("李某");
        student.setAge(18);
        teacher.teach();
        teacher.teach(student);
        student.listen();
    }
}


