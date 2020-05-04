package com.cn.exception;

public class CustomeException {
  private static String[] names = {"bill","hill","jill"};
    public static void main(String[] args) throws LoginException {
        checkUserName("bill");
        System.out.println("注册成功");
    }

     private static boolean checkUserName(String userName) throws LoginException {

         for (String name:names) {
             if (userName.equals(name)){
                 throw new LoginException(userName+" has been registered");
             }
         }
         return true;

     }



}
