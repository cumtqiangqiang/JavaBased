package com.cn.thread.sellTicket.sychronizeStatic;

public class Ticket implements  Runnable {

    private int  tickets = 100;

    @Override
    public void run() {

            sellTicketsStatic();

    }

    private  void  sellTicketsStatic(){
        while (true){
            synchronized (Ticket.class){
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


    private  void  sellTickets(){
        while (true){
            synchronized (this){
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
