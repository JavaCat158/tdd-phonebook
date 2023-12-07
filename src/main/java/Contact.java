import java.util.Objects;
public class Contact {
    private final String name;
    private final String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

