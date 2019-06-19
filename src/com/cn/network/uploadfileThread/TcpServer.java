package com.cn.network.uploadfileThread;

import com.sun.security.ntlm.Server;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TcpServer {

    public static void main(String[] args) throws IOException {
        File file = new File("./test/22");
        if (!file.exists()){
            file.mkdirs();

        }
        ServerSocket server = new ServerSocket(9999);
        while (true){
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream inputStream = socket.getInputStream();
                        String fileName = "itcast"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
                        FileOutputStream fos = new FileOutputStream(file.toString()+"/"+fileName);
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = inputStream.read(bytes))!= -1){
                            fos.write(bytes,0,len);
                        }
                        socket.getOutputStream().write("上传成功".getBytes());
                        fos.close();
                        socket.close();


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }




    }
}
