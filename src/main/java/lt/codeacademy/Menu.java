package lt.codeacademy;

import lt.codeacademy.entities.User;
import lt.codeacademy.services.UserService;

import java.util.Scanner;

public class Menu {
    private final Scanner scn = new Scanner(System.in);
    private final UserService userService = new UserService();

    public void init(){
        System.out.println("Sveiki atvyke i klausimyno sistema!");
        System.out.println("[1] Prisijungti");
        System.out.println("[2] Registruotis");
        System.out.println("[3] Iseiti");

        int mainMenuChoice = scn.nextInt();

        switch (mainMenuChoice){
            case 1 :
                System.out.println("Vartotojo vardas : ");
                String loginName = scn.next();
                System.out.println("Slaptazodis");
                String loginPassword = scn.next();

                System.out.println("-----------------------");
                System.out.println("[1] Sukurti klausimyna");
                System.out.println("[2] Perziureti savo informacija");


                int onLoginChoice = scn.nextInt();

                switch (onLoginChoice) {
                    case 1 :

                        break;
                    case 2 :

                        break;
                    default:
                        System.out.println("Neteisinga ivestis!");

                }

                break;
            case 2 :
                System.out.print("Vartotojo vardas : ");
                String username = scn.next();
                System.out.print("Slaptazodis : ");
                String password = scn.next();

                User user = userService.CreateUser(username, password);
                break;
            case 3 :
                break;
            default:
                System.out.println("Neteisinga ivestis!");
        }
    }
}
