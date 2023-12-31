import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

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

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "1234567890");
        phoneBook.add("Jane", "9876543210");

        String result1 = phoneBook.findByNumber("1234567890");
        assertEquals("John", result1);

        String result2 = phoneBook.findByNumber("9876543210");
        assertEquals("Jane", result2);

        String result3 = phoneBook.findByNumber("4564564564");
        assertNull(result3);
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "1234567890");
        phoneBook.add("Jane", "9876543210");

        String result1 = phoneBook.findByName("John");
        assertEquals("1234567890", result1);

        String result2 = phoneBook.findByName("Jane");
        assertEquals("9876543210", result2);

        String result3 = phoneBook.findByName("Alexandr");
        assertNull(result3);
    }

        @Test
        public void testPrintAllNames() {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("John", "1234567890");
            phoneBook.add("Jane", "9876543210");
            phoneBook.add("Bob", "7897897897");

            List<String> actualNames = phoneBook.getAllNames();

            // Ожидаемый результат с использованием System.lineSeparator()
            List<String> expectedNames = List.of("Bob", "Jane", "John");

            // Проверяем, совпадает ли вывод с ожидаемым результатом
            assertEquals(expectedNames, actualNames);
        }
    }