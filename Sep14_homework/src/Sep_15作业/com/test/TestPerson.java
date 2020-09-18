package Sep_15作业.com.test;

import Sep_15作业.com.homework.Person;

/**
 * @author LWQ
 * @title: TestPerson
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1611:53
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(18);

        Person person2 = new Person("李四", 18);
        System.out.println(person1);
        System.out.println(person2);
    }
}
