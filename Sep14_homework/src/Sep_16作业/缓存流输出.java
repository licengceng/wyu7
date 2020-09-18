package Sep_16作业;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//读取缓存流note.txt文件，每一行字符输出到控制台上
public class 缓存流输出 {
    public static void main(String[] args) {
        File file = new File("d:/note.txt");
        //创建文件字符流
        //缓存流必须建立在一个存在的流的基础上
        try (
                FileReader fileReader = new FileReader(file);
                 BufferedReader bufferedReader = new BufferedReader(fileReader);
                ){
                    while (true){
                        //读取一行
                         String line = bufferedReader.readLine();
                            if (line==null){
                                break;
                            }else {
                                System.out.println(line);
                            }
                    }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
