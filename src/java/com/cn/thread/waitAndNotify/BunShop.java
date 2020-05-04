package com.cn.thread.waitAndNotify;

public class BunShop  implements  Runnable{
    Bun bun;

    public BunShop(Bun bun) {
        this.bun = bun;
    }

    @Override
    public void run() {
        while (true){
           synchronized (bun){
               if (bun.flag == true){
                   try {
                       bun.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               bun.bunSkin = "薄皮";
               bun.xian = "猪肉大葱";
               System.out.println("包子铺正在生产Ing "+bun.bunSkin+bun.xian+"的包子");
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               bun.flag = true;
               bun.notify();
               System.out.println("包子铺生产好了DONE "+bun.bunSkin+bun.xian+"的包子");

           }



        }

    }
}
