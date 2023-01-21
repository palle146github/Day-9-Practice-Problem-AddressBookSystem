package com.bridgelabz.addressbooksystem;

import java.util.*;

// class for adding contact details which are declared in the class
public class AddressBook {
    Contact contact = new Contact();// Contact object declaration
    ArrayList<Contact> contactArrayList = new ArrayList<>();

    // method for adding a contact into Address Book System
    public void addContact() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of contacts to add Address Book System");
        int number = s.nextInt();
        for (int i = 0; i < number; i++) {
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
            // assigning current values to the Address Book System
            Contact contact = new Contact(firstname, lastname, address, city, state, zip, phonenumber, email);
            contactArrayList.add(contact);
        }
    }

    public void contactDisplay() {
        for (Contact contact : contactArrayList) {
            System.out.println(contact.toString());
        }
    }

    // method for updating existing contact in Address Book System
    public void editContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name to edit contact details");
        String fname = scanner.next();
        for (Contact contact : contactArrayList) {
            if (fname.equalsIgnoreCase(contact.getFirstname())) {
                System.out.println("Enter new first name : ");
                String firstname = scanner.next();

                System.out.println("Enter new last name : ");
                String lastname = scanner.next();

                System.out.println("Enter new Address : ");
                String address = scanner.next();

                System.out.println("Enter new  City : ");
                String city = scanner.next();

                System.out.println("Enter new  State : ");
                String state = scanner.next();

                System.out.println("Enter new  Pincode : ");
                String zip = scanner.next();

                System.out.println("Enter new Phone number : ");
                String phonenumber = scanner.next();

                System.out.println("Enter new Email : ");
                String email = scanner.next();

                contact.setFirstname(firstname);
                contact.setLastname(lastname);
                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setPhonenumber(phonenumber);
                contact.setEmail(email);
                contact.setZip(zip);
                break;
            }
            else{
                System.out.println("Contact with " + fname + " does not exist");
            }
        }
    }

    public void deleteContact() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name to delete contact from the Address Book System");
        String fname = scanner.next();
        for (Contact contact : contactArrayList) {
            if (fname.equalsIgnoreCase(contact.getFirstname())) {
                contactArrayList.remove(contact);
                break;
            } else {
                System.out.println("Contact " + fname + " does not exist in Address Book System");
            }
        }
    }
}
