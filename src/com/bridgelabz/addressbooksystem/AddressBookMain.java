package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

public class AddressBookMain {// Address book main calss
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner s = new Scanner(System.in);
        while(true){// infinite loop for multiple task performance
        System.out.println("Choose one option");
        System.out.println("1. Add contact  2. Edit contact  3. Delete Contact 4. Display Contacts");
        int option = s.nextInt();
            switch (option) {
                case 1:
                    addressBook.addContact();// add contact method call
                    break;
                case 2:
                    addressBook.editContact();// edit contact method call
                    break;
                case 3:
                    addressBook.deleteContact();// delete contact method call
                    break;
                case 4:
                    addressBook.contactDisplay();// display contacts method call
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
