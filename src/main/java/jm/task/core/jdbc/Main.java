package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("Николай", "Задорожнов", (byte) 25);
        userDaoJDBC.saveUser("Игорь", "Круглов", (byte) 12);
        userDaoJDBC.saveUser("Анастасия", "Конева", (byte) 56);
        userDaoJDBC.saveUser("Артур", "Смекалов", (byte) 32);
        userDaoJDBC.getAllUsers();
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}
