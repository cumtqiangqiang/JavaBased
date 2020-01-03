package cn.qiang.learn.coreclass;

public class BoxType {
    public static void main(String[] args) {
        int x1 = Integer.parseInt("100");
        System.out.println(x1);
        int x2 = Integer.parseInt("100",16);
        System.out.println(x2);

        String s = Integer.toString(100,36);
        System.out.println(s);
    }
}
