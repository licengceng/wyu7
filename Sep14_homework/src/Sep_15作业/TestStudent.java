package Sep_15作业;


//深拷贝与浅拷贝区别
// 深拷贝：引用对象的值等信息，复制一份一样的。             |
// 浅拷贝：只复制引用，另一处修改，你当下的对象也会修改。

//        浅拷贝---能复制变量，如果对象内还有对象，则只能复制对象的地址
//        深拷贝---能复制变量，也能复制当前对象的 内部对象


public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(18);
        student1.setClazz("7班");

        Student student2 = new Student("李四",18,"8班");

        System.out.println(student1);
        System.out.println(student2);
    }
}
