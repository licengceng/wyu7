package Sep_15作业.com.test;

import Sep_15作业.com.homework.Phone;

/**
 * @author LWQ
 * @title: Main
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1611:40
 */
public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setScreenSize(6);
        phone.setBrand("小米手机");
        phone.setCpu(855);
        phone.setMemory(128);

        System.out.println(phone);
    }
}
