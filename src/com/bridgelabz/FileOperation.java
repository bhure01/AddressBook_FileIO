package com.bridgelabz;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class FileOperation {
    public static final String FILE_PATH= "contact.csv";
    public static void writeFile() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Name");
            String firstName = sc.nextLine();
            System.out.println("Enter Last Name");
            String lastName = sc.nextLine();
            System.out.println("Enter Address");
            String address = sc.nextLine();
            System.out.println("Enter City");
            String city = sc.nextLine();
            System.out.println("Enter State");
            String state = sc.nextLine();
            System.out.println("Enter Phone");
            String phone = sc.nextLine();
            System.out.println("Enter Email.");
            String email = sc.nextLine();
            FileWriter file = new FileWriter(FILE_PATH);
            CSVWriter cw = new CSVWriter(file);
            String[] data = {firstName, lastName, address, city, state, phone, email};
            cw.writeNext(data);
            System.out.println("AddressBook Written Successfully");
            file.close();
        }
        catch (Exception e){}
    }
    public static <CSVReader> void readFile() {
        try {
            Reader rd = Files.newBufferedReader(Paths.get(FILE_PATH));
            CSVReader csvrd= new CSVReader(rd)  ;
            String[] info;
            while((info=csvrd.readNext())!=null)
            {
                System.out.println("First Name: "+info[0]);
                System.out.println("Last Name: "+info[1]);
                System.out.println("Address: "+info[2]);
                System.out.println("City: "+info[3]);
                System.out.println("State: "+info[4]);
                System.out.println("Email: "+info[6]);
                System.out.println("Phone: "+info[5]);
                System.out.println("*****************************");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}