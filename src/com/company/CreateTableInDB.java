package com.company;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.Statement;
/*Класс для создания таблиц в БД*/
public class CreateTableInDB {

/*Метод при помощи которого создаются таблицы в БД*/
    public  void createTableInDB(Connection con){

        Statement stmt = null ;

        try {
            stmt = con.createStatement();

            //создание таблицы Предметы
            String TableObject = "CREATE TABLE IF NOT EXISTS Object " +
                    "(idObject  INTEGER  NOT NULL, " +
                    " NameObject  VARCHAR(255) NOT NULL, " +
                    " idCabinet INTEGER  NOT NULL, " +
                    " idWeek INTEGER NOT NULL, " +
                    " PRIMARY KEY (idObject))";

            stmt.executeUpdate(TableObject);
            System.out.println("Создана таблица Предметы.");

            //создание таблицы Аудитории
            String Cabinet = "CREATE TABLE IF NOT EXISTS Cabinet " +
                    "(idCabinet  INTEGER  NOT NULL, " +
                    " Cabinet INTEGER  NOT NULL, " +
                    " PRIMARY KEY (idCabinet))";

            stmt.executeUpdate(Cabinet);
            System.out.println("Создана таблица Кабинет.");

            //создание таблицы Дни недели
            String Week = "CREATE TABLE IF NOT EXISTS Week " +
                    "(idWeek  INTEGER  NOT NULL, " +
                    " Week VARCHAR(255)  NOT NULL, " +
                    " PRIMARY KEY (idWeek))";

            stmt.executeUpdate(Week);
            System.out.println("Создана таблица Дни недели.");

            //создание таблицы Преподаватели
            String Professor = "CREATE TABLE IF NOT EXISTS Professor " +
                    "(idProfessor  INTEGER  NOT NULL, " +
                    " FIO  VARCHAR(255)  NOT NULL, " +
                    " idObject INTEGER  NOT NULL, " +
                    " numberOfLessons INTEGER  NOT NULL, " +
                    " numberOfStudents INTEGER  NOT NULL, " +
                    " PRIMARY KEY (idProfessor))";

            stmt.executeUpdate(Professor);
            System.out.println("Создана таблица Преподователи.");

            } catch (SQLException e) {
                e.printStackTrace();
            }

    }
}
