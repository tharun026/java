package mobilephone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact) {
        if (findContact(newContact.getName()) == -1) {
            myContacts.add(newContact);
            return true;
        }
        System.out.println("Contact is already on file");
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index >= 0) {
            myContacts.set(index, newContact);
            System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
            return true;
        }
        System.out.println(oldContact.getName() + ", was not found");
        return false;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index >= 0) {
            myContacts.remove(index);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName() == name) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName() == name) {
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
