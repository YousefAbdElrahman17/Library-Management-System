package Library;

import java.util.Scanner;

public class Main{

    static Scanner registerSelect;

    public static void main(String[] args){

        Database database = new Database();

        System.out.print("""
                Holaaa!
                (1) login 
                (2) New User
                : """);
        registerSelect = new Scanner(System.in);
        int num = registerSelect.nextInt();                  // convert input(regSelect) to Int and store it in "num"
        switch(num){
            case 1: login();   break;
            case 2: newUser(); break;
            default: System.out.println("Error!!");
        }







        registerSelect.close();
    }


    private static void login(){
        System.out.print("Enter Phone number: ");
        String phoneNum = registerSelect.next();
        System.out.print("Enter Email: ");
        String email = registerSelect.next();

    }
    private static void newUser(){
        System.out.print("Enter Name: ");
        String name = registerSelect.next();
        System.out.print("Enter Phone number: ");
        String phoneNum = registerSelect.next();
        System.out.print("Enter Email: ");
        String email = registerSelect.next();
        System.out.print("""
                (1) Admin
                (2) Normal user
                : """);
        int n2 = registerSelect.nextInt();
        if (n2==1){
            User admin = new Admin(name, email, phoneNum);
        }
        else{
            User user = new NormalUser(name, email, phoneNum);
        }
    }



}