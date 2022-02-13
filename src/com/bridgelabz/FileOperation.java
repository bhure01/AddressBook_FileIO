package com.bridgelabz;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOperation {
    public static void writeFile() {
        try {
            FileWriter myFile = new FileWriter("contact.txt");
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter First Name");
            String firstName=sc.nextLine();
            System.out.println("Enter Last Name");
            String lastName=sc.nextLine();
            System.out.println("Enter Address");
            String address=sc.nextLine();
            System.out.println("Enter City");
            String city=sc.nextLine();
            System.out.println("Enter State");
            String state=sc.nextLine();
            System.out.println("Enter Phone Number");
            String phn=sc.nextLine();
            System.out.println("Enter Email");
            String email=sc.nextLine();
            myFile.write(""+firstName+"|"+lastName+"|"+address+"|"+city+"|"+state+"|"+phn+"|"+email);
            System.out.println("AddressBook Written successfully");
            myFile.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void readFile() {
        File myFile= new File("contact.txt");
        try {
            String value;
            BufferedReader bf = new BufferedReader(new FileReader(myFile));
            while((value=bf.readLine())!=null)
            {
                String[] info=value.split("|");
                System.out.println("First Name: "+info[0]);
                System.out.println("Last Name: "+info[1]);
                System.out.println("Address: "+info[2]);
                System.out.println("City: "+info[3]);
                System.out.println("State: "+info[4]);
                System.out.println("Email: "+info[6]);
                System.out.println("Phone: "+info[5]);
                System.out.println("*****************************");
            }
        }
        catch (Exception e)
        {

        }
    }
}