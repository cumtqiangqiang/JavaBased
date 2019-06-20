package com.cn.sql;



import java.sql.*;

public class JDBCUtils {
  private  static String driver = "com.mysql.jdbc.Driver";
  private  static String url =   "jdbc:mysql://localhost:3306/test";
  private  static  String user = "root";
  private  static  String password = "123456";
  static  {
      try {
          Class.forName(driver);
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
  }

  public static Connection getConnection() throws SQLException {
      Connection connection = DriverManager.getConnection(url, user, password);
      return  connection;
  }

  private static void closeResource(Connection conn, Statement st, ResultSet rs) throws SQLException {
      if (rs != null){
          try {
              rs.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
      if (st!= null){
          st.close();
      }
      if (conn != null){
          conn.close();
      }


  }


}
