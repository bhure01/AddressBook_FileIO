package com.bridgelabz;

import java.io.*;
import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select the following Operation");
        System.out.println("1. Add New Contact"+"\n"+"2. Read All Contacts");
        int option=sc.nextInt();
        switch (option)
        {
            case 1: FileOperation.writeFile();
                break;
            case 2: FileOperation.readFile();
                break;
            default: System.out.println("Invalid Choice Option Selected");
        }
    }
}