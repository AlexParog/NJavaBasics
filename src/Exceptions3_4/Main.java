package Exceptions3_4;

import Exceptions3_4.task1.AccessDeniedException;
import Exceptions3_4.task1.User;
import Exceptions3_4.task1.UserNotFoundException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws  UserNotFoundException, AccessDeniedException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();


        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);
        System.out.println("Доступ представлен");
    }

    public static User[] getUsersList() {
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
        User user2 = new User("alex","alex@gmail.com","superalex",17);
        User user3 = new User("bob", "bob13@mail.ru", "bob12345", 23);
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsersList();
        for (User user : users) {
            if (user.getPassword().equals(password) && user.getLogin().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found for " + login);
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("You are not yet is years old");
        } else {
            System.out.println("You are 18 years old");
        }
    }
}
