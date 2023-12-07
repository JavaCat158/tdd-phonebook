import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();

        int result1 = phoneBook.add("John", "1234567890");
        assertEquals(1, result1);

        int result2 = phoneBook.add("Jane", "9876543210");
        assertEquals(2, result2);

        int result3 = phoneBook.add("John", "5555555555");
        assertEquals(2, result3);
    }
}
