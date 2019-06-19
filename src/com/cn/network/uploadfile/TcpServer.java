package com.cn.network.uploadfile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        File file = new File("./test/22");
        if (!file.exists()){
            file.mkdirs();

        }
        ServerSocket server = new ServerSocket(9999);
        Socket socket = server.accept();
        InputStream is =  socket.getInputStream();
        FileOutputStream fos = new FileOutputStream(file.toString()+"/1.jpg");
        byte[] bytes = new byte[1025];
        int len = 0;
        while ((len=is.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }
        fos.close();
        socket.getOutputStream().write("UploadSucess".getBytes());
        socket.close();server.close();




    }
}
