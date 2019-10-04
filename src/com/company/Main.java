package com.company;
import java.sql.Connection;
import java.sql.*;
/*Программа для работы с базой данных преподователей и предметов*/
public class Main {

   public static void main(String[] args)  {

       ConnectionDatabase connectionDatabase = new ConnectionDatabase();
       //вызов метода соединения с БД
       Connection connection = connectionDatabase.connectionDatabase();
       try {
           //заполнение БД данными
           FillData fillData = new FillData();
           fillData.fillData(connection);
       } catch (SQLException e) {
           System.out.println(e);
       }finally {
           connection.isClosed();
           System.out.println("Соединение закрыто.");
       }

   }
}