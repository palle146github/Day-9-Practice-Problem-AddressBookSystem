package com.bridgelabz.addressbooksystem;

public class Contact {
    private String firstname, lastname, address, city, state, zip, phonenumber ,email;
    Contact(){}

    public Contact(String firstname, String lastname, String address, String city, String state, String zip, String phonenumber, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phonenumber = phonenumber;
        this.email = email;
    }
}
