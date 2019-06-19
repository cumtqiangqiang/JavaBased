package com.cn.IO.reader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 读取字符流，汉字在字节流中容易出错
 */
public class DemoReader1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./test/2.txt");
        int len = 0;
//        while ((len = fr.read())!=-1){
//            System.out.println((char) len);
//        }

        char[] chars = new char[10];
        while ((len = fr.read(chars))!= -1){

            System.out.println(new String(chars,0,len));
        }
        fr.close();






    }

}
