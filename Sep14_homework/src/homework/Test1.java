package homework;

import java.util.Arrays;

/**
 * @author LWQ
 * @title: Test1
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1417:07
 */
public class Test1 {
    public static void main(String[] args) {
        int a[]=new int[6];
        for (int i = 0; i <6 ; i++) {
            a[i]=i+1;
        }
        System.out.println("原数组为元素：");
        for (int x:a) {
            System.out.print(x+" ");
        }
        //反转
        for (int i =0 ; i <a.length/2 ; i++) {
            int temp=a[i];
            a[i]=a[5-i];
            a[5-i]=temp;
        }
        System.out.println("\n反转后数组元素为：");
        for (int x:a) {
            System.out.print(x+" ");
        }

       /* for (int i = 1; i <=9 ; i++) {  //九九乘法表
            System.out.println();
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
        }*/
    }
}
