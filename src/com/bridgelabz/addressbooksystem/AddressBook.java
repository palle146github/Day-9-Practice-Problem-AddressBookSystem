package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class AddressBook {
    Contact contact = new Contact();

    ArrayList<Contact> addressBook = new ArrayList<>();

    public void addContact() {
        boolean modify = false;
        boolean empty = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the details!! ");
        System.out.println("Enter your first name!!");
        String firstname = sc.nextLine();
        if (addressBook.size() != 0) {  // UC 6 : logic for checking that the names should be Uniques
            empty = false;
            Iterator<Contact> itr = addressBook.iterator();
            while (itr.hasNext()) {
                Contact con = itr.next();
                if (con.getFirstname().equalsIgnoreCase(firstname)) {
                    System.out.println("Duplicate Entry!! Please start again!!!");
                    modify = false;
                } else {
                    modify = true;
                }
            }
        }
        if (modify == true || empty == true) {
            System.out.println("Enter your last name!!");
            String lastname = sc.nextLine();
            System.out.println("Enter your address name!!");
            String address = sc.nextLine();
            System.out.println("Enter your city!!");
            String city = sc.nextLine();
            System.out.println("Enter your state!!");
            String state = sc.nextLine();
            System.out.println("Enter your email!!");
            String email = sc.nextLine();
            System.out.println("Enter the Zip code!!");
            String zip = sc.nextLine();
            System.out.println("Enter your phone number!!");
            String phonenumber = sc.nextLine();
            addressBook.add(new Contact(firstname, lastname, address, city, state, email, zip, phonenumber));
            System.out.println("Contact details succesfully added...!!!");
        }
    }

    public void showaddress() {
        if (addressBook.size() != 0) {
            Iterator<Contact> iterator = addressBook.iterator();
            while (iterator.hasNext()) {
                Contact c = iterator.next();
                System.out.println(c);
            }
        } else {
            System.out.println("No contact exist in the list");
        }
    }

        public void deleteContact() {
        Scanner scb = new Scanner(System.in);
        System.out.println("Please enter the First name for which you want to delete the contact details!!");
        String fname = scb.nextLine();
        Iterator<Contact> iterator = addressBook.iterator();
        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (fname.equalsIgnoreCase(c.getFirstname())) {
                addressBook.remove(c);
                System.out.println("Contact of " + fname + " is successfully deleted");
                break;
            }
            else {
                System.out.println("Contact of " + fname + " does not exist");
            }
        }
    }
//
    public void updateContact() {
        String newlname;
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the First name of the contact whose deatils you wish to update!!");
        String targetfirstname = sca.nextLine();
        Iterator<Contact> iterator = addressBook.iterator();
        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (targetfirstname.equalsIgnoreCase(c.getFirstname())) {
                System.out.println("Enter the choice to update the details!!!");
                System.out.println("1.First Name   2.Last Name   3.Address   4.City   5.State   6.Email Id   7.ZipCode   8.PhoneNumber   9.Update all contacts");
                int option = sca.nextInt();

                switch (option) {
                    case 1:
                        Scanner sc9 = new Scanner(System.in);
                        System.out.println("Enter the new first name!!");
                        String newfname = sc9.nextLine();
                        c.setFirstname(newfname);
                        System.out.println("Record updated for first name!!");
                        break;

                    case 2:
                        Scanner sc8 = new Scanner(System.in);
                        System.out.println("Enter the new last name!!");
                        newlname = sc8.nextLine();
                        c.setLastname(newlname);
                        System.out.println("Record updated for last name!!");
                        break;

                    case 3:
                        Scanner sc7 = new Scanner(System.in);
                        System.out.println("Enter the new Address!!");
                        String newaddress = sc7.nextLine();
                        c.setAddress(newaddress);
                        System.out.println("Record updated for address!!");
                        break;
                    case 4:
                        Scanner sc6 = new Scanner(System.in);
                        System.out.println("Enter the new city!!");
                        String newcity = sc6.nextLine();
                        c.setCity(newcity);
                        System.out.println("Record updated for city!!");
                        break;

                    case 5:
                        Scanner sc5 = new Scanner(System.in);
                        System.out.println("Enter the new city!!");
                        String newstate = sc5.nextLine();
                        System.out.println("Enter the new state!!");
                        c.setState(newstate);
                        System.out.println("Record updated for state!!");
                        break;
                    case 6:
                        Scanner sc4 = new Scanner(System.in);
                        System.out.println("Enter the new Email!!");
                        String newemail = sc4.nextLine();
                        c.setEmail(newemail);
                        System.out.println("Record updated for email!!");
                        break;

                    case 7:
                        Scanner sc3 = new Scanner(System.in);
                        System.out.println("Enter the new Zipcode!!");
                        String newzip = sc3.nextLine();
                        c.setZip(newzip);
                        System.out.println("Record updated for zip!!");
                        break;

                    case 8:
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("Enter the new phone number!!");
                        String newphone = sc2.nextLine();
                        c.setPhonenumber(newphone);
                        System.out.println("Record updated for phonenumber!!");
                        break;

                    case 9:
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("Enter the new first name!!");
                        String fName = sc1.nextLine();
                        System.out.println("Enter the new last name!!");
                        String lname = sc1.nextLine();
                        System.out.println("Enter new Address!! ");
                        String naddress = sc1.nextLine();
                        System.out.println("Enter new city!! ");
                        String ncity = sc1.nextLine();
                        System.out.println("Enter the new state!!");
                        String nstate = sc1.nextLine();
                        System.out.println("Enter the new email!!");
                        String nemail = sc1.nextLine();
                        System.out.println("Enter the new Zipcode!!");
                        String nzip = sc1.nextLine();
                        System.out.println("Enter the new phone number!!");
                        String nphonenumber = sc1.nextLine();
                        c.setFirstname(fName);
                        c.setLastname(lname);
                        c.setAddress(naddress);
                        c.setCity(ncity);
                        c.setState(nstate);
                        c.setEmail(nemail);
                        c.setZip(nzip);
                        c.setPhonenumber(nphonenumber);
                        System.out.println("All details are updated!!");
                        break;

                    default:
                        System.out.println("Incorrect choice!!");
                }
            }
        }
    }
}