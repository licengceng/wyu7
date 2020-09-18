package Sep_16作业;

import java.io.*;

public class 文件流复制文件 {
    public static void main(String[] args) throws IOException {
        String src="d:/myfile.txt";
        String dest="d:/myfile_cp.txt";
        copy(src,dest);
    }

    public static void copy(String src,String dest) throws IOException {
         File file1 = new File(src);
         File file2 = new File(dest);
        try (
                FileInputStream fis = new FileInputStream(file1);
                FileOutputStream fos = new FileOutputStream(file2);
                ){
            byte[] bytes = new byte[1024];
            int length;
                   while ((length=fis.read(bytes))!=-1){
                        fos.write(bytes, 0, length);
                   }
        }
        System.out.println("复制完成");
    }
}
