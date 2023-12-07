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
    public String findByNumber(String phoneNumber) {
        for(Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact.getName();
            }
        }
        return null;
    }
    public String findByName(String name) {
        for(Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact.getPhoneNumber();
            }
        }
        return null;
    }
    public List<String> getAllNames() {
        return new ArrayList<>();
    }
}
