package com.cn.thread.sellTicket.synchronize;

public class Ticket implements  Runnable {

    private int  tickets = 100;
    Object object = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (object){
                if (tickets > 0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+"正在卖第 "+tickets+" 张票");
                    tickets--;


                }else {
                    break;
                }
            }


        }
    }


}
