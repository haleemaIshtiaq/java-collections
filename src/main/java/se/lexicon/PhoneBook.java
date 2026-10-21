package se.lexicon;

import java.util.HashMap;

public class PhoneBook {
    void main(){
        HashMap<String,String> contacts = new HashMap<>();
        //Add four contacts
        contacts.put("ali", "0701234567");
        contacts.put("omer", "0701237654");
        contacts.put("sara", "0707654321");
        contacts.put("ahmed", "0701113456");

        String name = IO.readln("Enter name: ");
        name=name.trim().toLowerCase();

        if(contacts.containsKey(name)){
            IO.println("Phone number: " +contacts.get(name));
        }
        else{
            IO.println("Contact not found.");
        }
    }
}
