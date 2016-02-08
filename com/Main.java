package com;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        logger.info("Print something in log file");
        logger.warning("Print some warning information");

////////////////////////////////////////////////////////////////////////////////////////

        Scanner console = new Scanner(System.in);

        User[] userArray = new User[4];
        userArray[0] = new User(Role.USER, "sveta1234", "sveta", "Sveta", "female");
        userArray[1] = new User(Role.USER, "igor1234", "igor", "Igor", "male");
        userArray[2] = new User(Role.ADMIN, "tanya1234", "tanya", "Tanya", "female");
        userArray[3] = new User(Role.USER, "???1234", "???", "???", "nevedomoe");

////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Enter your login");
        String usersLogin = console.nextLine();

        System.out.println("Enter your password");
        String usersPassword = console.nextLine();

////////////////////////////////////////////////////////////////////////////////////////

        assert !usersLogin.isEmpty() || !usersPassword.isEmpty() : "Please Enter your login and password";

        try {
            enter(userArray, usersPassword, usersLogin);
        } catch (CustomException e) {
            e.printInfo();
        }
    }

////////////////////////////////////////////////////////////////////////////////////////

    public static void enter(User[] users, String password, String login) throws CustomException {
        int i = 0;
        while (true){
            if (login.equals(users[i].getLogin()) && password.equals(users[i].getPassword())){
                System.out.println("Name -> " + users[i].getName());
                System.out.println("Gender -> " + users[i].getGender());
                System.out.println("Login -> " + users[i].getLogin());
                System.out.println("Password -> " + users[i].getPassword());
                System.out.println("Role -> " + users[i].getRole());
                System.out.print("Role -> ");
                users[i].getRole().getInfo();
                break;
            }
            i++;
            if (i >= users.length)throw new CustomException();
        }
    }
}
