package text_6_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//复制其他文件
public class ioliu {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("G:\\我的Java2.0\\窗里窗外.txt");

        FileOutputStream fos =new FileOutputStream("我的Java2.0\\窗里窗外.txt");

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }

        fis.close();

        fos.close();
    }
}
