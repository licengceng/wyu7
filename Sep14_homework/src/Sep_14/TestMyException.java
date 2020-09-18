package Sep_14;


import homework.MyException;

import java.util.Scanner;

/**
 * @author LWQ
 * @title: TestMyException
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1416:17
 */
public class TestMyException {
    public static void main(String[] args) throws MyException {
        try
        {
            System.out.println("输入一个数：");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i<0){
                System.out.println(i);

                MyException MY=new MyException("输入了负数:"+i);
//                throw(MY);
                throw new MyException("输入了错误数字:"+i);
            }


        }catch (MyException e){
            e.printStackTrace();

        }
    }
}
