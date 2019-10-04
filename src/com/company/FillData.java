package com.company;
import java.sql.*;
import com.sun.jdi.Value;
import java.sql.SQLException;
import java.sql.Statement;

/* Класс для заполнения  БД данными */
public class FillData {

    /*метод при помощи которого можно добавлять данные в БД*/
    public void fillData( Connection connection ) {
        PreparedStatement preparedStatement = null;
         try {
             String SQL = "INSERT INTO object(idObject, NameObject, idCabinet, idWeek) VALUES(?,?,?,?)";
             preparedStatement = connection.prepareStatement(SQL);

             // Заполнение таблицы Предметы
             preparedStatement.setInt(1,1);
             preparedStatement.setString(2,"Программирование");
             preparedStatement.setInt(3,2);
             preparedStatement.setInt(4,3);
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

             preparedStatement.setInt(1,2);
             preparedStatement.setString(2,"База данных");
             preparedStatement.setInt(3,1);
             preparedStatement.setInt(4,5);
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

             preparedStatement.setInt(1,3);
             preparedStatement.setString(2,"Математика");
             preparedStatement.setInt(3,3);
             preparedStatement.setInt(4,2);
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

             // Заполнение таблицы Дни недели
             SQL = "INSERT INTO week(idWeek, Week ) VALUES(?,?)";
             preparedStatement = connection.prepareStatement(SQL);
             preparedStatement.setInt(1,1);
             preparedStatement.setString(2,"Понедельник");
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

             preparedStatement.setInt(1,2);
             preparedStatement.setString(2,"Вторник");
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

             preparedStatement.setInt(1,3);
             preparedStatement.setString(2,"Среда");
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

             preparedStatement.setInt(1,4);
             preparedStatement.setString(2,"Четверг");
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

             preparedStatement.setInt(1,5);
             preparedStatement.setString(2,"Пятница");
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

             // Заполнение таблицы Аудитории
             SQL = "INSERT INTO cabinet(idCabinet, Cabinet ) VALUES(?,?)";
             preparedStatement = connection.prepareStatement(SQL);
             preparedStatement.setInt(1,1);
             preparedStatement.setInt(2,312);
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

             preparedStatement.setInt(1,2);
             preparedStatement.setInt(2,502);
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

             preparedStatement.setInt(1,3);
             preparedStatement.setInt(2,202);
             preparedStatement.addBatch();
             preparedStatement.executeBatch();


             // Заполнение таблицы Преподователи
             SQL = "INSERT INTO professor(idProfessor, FIO, idObject, numberOfLessons, numberOfStudents ) VALUES(?,?,?,?,?)";
             preparedStatement = connection.prepareStatement(SQL);
             preparedStatement.setInt(1,1);
             preparedStatement.setString(2,"Иванов И.И.");
             preparedStatement.setInt(3,2);
             preparedStatement.setInt(4,5);
             preparedStatement.setInt(5,18);
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

             preparedStatement.setInt(1,2);
             preparedStatement.setString(2,"Петров П.П");
             preparedStatement.setInt(3,1);
             preparedStatement.setInt(4,12);
             preparedStatement.setInt(5,30);
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

             preparedStatement.setInt(1,3);
             preparedStatement.setString(2,"Сидиров С.С.");
             preparedStatement.setInt(3,3);
             preparedStatement.setInt(4,7);
             preparedStatement.setInt(5,20);
             preparedStatement.addBatch();
             preparedStatement.executeBatch();

         } catch (SQLException e) {
             System.out.println(e);
         }

    }

}
