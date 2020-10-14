package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.ArrayList;


public class Main {
    private static final UserService userService = new UserServiceImpl();
    private static User user1 = new User("Mitroy", "Gopit", (byte) 60);
    private static User user2 = new User("Jija", "Top", (byte) 15);
    private static User user3 = new User("Stariy", "Pes", (byte) 126);
    private static User user4 = new User("Legkiy", "Qyqer", (byte) 76);

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("User с именем – " + user1.getName() + " добавлен в базу данных");

        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("User с именем – " + user2.getName() + " добавлен в базу данных");

        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("User с именем – " + user3.getName() + " добавлен в базу данных");

        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println("User с именем – " + user4.getName() + " добавлен в базу данных");

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
