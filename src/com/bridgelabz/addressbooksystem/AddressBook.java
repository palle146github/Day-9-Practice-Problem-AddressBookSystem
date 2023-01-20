package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBook {
    
    Contact contact = new Contact();// Contact object declaration
    
    // method for adding a contact into address book system
    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter contact details");
        System.out.println("Enter first name");
        String firstname = scanner.next();
        
        System.out.println("Enter last name");
        String lastname = scanner.next();
        
        System.out.println("Enter Address");
        String address = scanner.next();
        
        System.out.println("Enter City");
        String city = scanner.next();
        
        System.out.println("Enter State");
        String state = scanner.next();
        
        System.out.println("Enter Pincode");
        String zip = scanner.next();
        
        System.out.println("Enter Phone number");
        String phonenumber = scanner.next();
        
        System.out.println("Enter Email");
        String email = scanner.next();

        Contact contact = new Contact(firstname,lastname, address, city, state, zip, phonenumber, email);
        this.contact = contact;
    }
}
