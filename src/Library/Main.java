package Library;

import java.util.Scanner;

public class Main{

    static Scanner regSelect;

    public static void main(String[] args){
        System.out.println("test");

        System.out.println("""
                Holaaa!\n
                (1) login\n
                 (2) New User""");
        regSelect = new Scanner(System.in);
        int num = regSelect.nextInt();                  // convert input(regSelect) to Int and store it in "num"
        switch(num){
            case 1: login();   break;
            case 2: newUser(); break;
            default: System.out.println("Error!!");
        }







        regSelect.close();
    }


    private static void login(){
        System.out.println("Enter Phone number: ");
        String phoneNum = regSelect.next();
        System.out.println("Enter Email: ");
        String email = regSelect.next();

    }
    private static void newUser(){
        System.out.println("Enter Name: ");
        String name = regSelect.next();
        System.out.println("Enter Phone number: ");
        String phoneNum = regSelect.next();
        System.out.println("Enter Email: ");
        String email = regSelect.next();
        System.out.println("""
                (1) Admin\n
                (2) Normal user
                """);

    }




}