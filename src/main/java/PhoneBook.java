import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;
    PhoneBook(){
        contacts = new ArrayList<>();
    }
    public int add(String name, String number) {
        if (contacts.stream().anyMatch(contact -> contact.getName().equals(name))) {
            return contacts.size();
        }

        Contact newContact = new Contact(name, number);
        contacts.add(newContact);

        return contacts.size();
    }
}
