package com.database;
import java.sql.*;
public class Database{
  private String ip = "140.120.54.114";
  private String port = "3306";
  private String url = "";
  private String user = "jspuser";
  private String password = "jspuser";
  private String db = "jspuser";
  private String driver = "com.mysql.jdbc.Driver";
  private Connection con = null;
  private Statement stmt = null;
  private ResultSet rs = null;
  public Database(){
  }
  public void connectDB(){
    try{
      url = "jdbc:mysql://" + ip +":" + port + "/" + db + "?useUnicode=true&characterEncoding=utf-8";
      Class.forName(driver);
      con = DriverManager.getConnection(url, user, password);
      stmt = con.createStatement();
    }catch(Exception ex){
      System.out.println(ex);
    }
  }
  public void query(String sql){
    try{
      rs = stmt.executeQuery(sql);
    }catch(Exception ex){
      System.out.println(ex);
    }
  }
  public Connection getCon(){
    return con;
  }
  public ResultSet getRS(){
    return rs;
  }
  public void setIp(String ip){
    this.ip = ip;
  }
  public void setPort(String port){
    this.port = port;
  }
  public void setUrl(String ip , String port){
    this.url = "jdbc:mysql://" + ip + ":" + port + "/";
  }
  public void setDB(String dbName){
    this.db = dbName;
  }
  public void setUser(String username){
    this.db = username;
  }
  public void setPassword(String password){
    this.password = password;
  }
  public void setDriver(String driver){
    this.driver = driver;
  }
}
