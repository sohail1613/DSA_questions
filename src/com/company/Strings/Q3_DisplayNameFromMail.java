//Input an email from the user. You have to create a username from the email by
//deleting the part that comes after ‘@’. Display that username to the user.
//Example :
//email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
//email = “helloWorld123@gmail.com”; username = “helloWorld123”

package com.company.Strings;

import java.util.Scanner;

public class Q3_DisplayNameFromMail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gmail: ");
        String gmail = sc.nextLine();
        String name="";

        for (int i=0; i<gmail.length(); i++){
            if (gmail.charAt(i) == '@'){
                break;
            } else {
                name += gmail.charAt(i);
            }
        }
        System.out.println("Name is: "+name);
    }
}
