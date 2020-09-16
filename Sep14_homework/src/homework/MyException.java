package homework;

/**
 * @author LWQ
 * @title: MyException
 * @projectName Sep14_homework
 * @description: TODO
 * @date 2020/9/1416:15
 */
public class MyException extends Exception {
    String message;


    public MyException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
