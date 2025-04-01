package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Иван", "Иванов", (byte) 30);
        System.out.println("User с именем — Иван добавлен в базу данных");

        userService.saveUser("Петр", "Петров", (byte) 25);
        System.out.println("User с именем — Петр добавлен в базу данных");

        userService.saveUser("Анна", "Сидорова", (byte) 22);
        System.out.println("User с именем — Анна добавлен в базу данных");

        userService.saveUser("Мария", "Кузнецова", (byte) 27);
        System.out.println("User с именем — Мария добавлен в базу данных");

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        System.out.println("Таблица очищена");

        userService.dropUsersTable();
        System.out.println("Таблица удалена");
    }
}
