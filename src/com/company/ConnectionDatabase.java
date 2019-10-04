package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*Класс для соединения с БД*/
public class ConnectionDatabase {

    //в константах url к базе данным , имя пользователя и пароль
    private static final String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=Europe/Moscow&useSSL=false";;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "qwerty90";

/*метод при помощи которого утсанвливается соединение с БД*/
    public Connection connectionDatabase(){
        CreateTableInDB createTableInDB = new CreateTableInDB();
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //если соединение не зактрыто, то установить соединение
            if (!con.isClosed()) {
                System.out.println("Соединение c БД установлено.");

                //вывоз метода создания таблиц
                createTableInDB.createTableInDB(con);
                System.out.println("Таблицы созданы успешно.");

            }

        } catch (SQLException e) {
            System.out.println("Соединение с БД не установлено");
            System.out.println(e);

        }
        return con;
    }

}
