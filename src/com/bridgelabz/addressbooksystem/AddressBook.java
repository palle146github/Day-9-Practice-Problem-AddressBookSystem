package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBook {
    Contact contact = new Contact();


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

    public void editContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name to edit contact details");
        String fname = scanner.next();
        if( fname.equalsIgnoreCase(contact.getFirstname())){
            System.out.println("Enter new first name");
            String firstname = scanner.next();
            System.out.println("Enter new last name");
            String lastname = scanner.next();
            System.out.println("Enter new Address");
            String address = scanner.next();
            System.out.println("Enter new  City");
            String city = scanner.next();
            System.out.println("Enter new  State");
            String state = scanner.next();
            System.out.println("Enter new  Pincode");
            String zip = scanner.next();
            System.out.println("Enter new Phone number");
            String phonenumber = scanner.next();
            System.out.println("Enter new Email");
            String email = scanner.next();

            Contact contact = new Contact(firstname,lastname, address, city, state, zip, phonenumber, email);
            this.contact = contact;

        }
    }


}
