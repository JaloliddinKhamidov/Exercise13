import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeReader {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                employees.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Size of the collection: " + employees.size());

        System.out.println("Using a standard loop:");
        for (String employee : employees) {
            System.out.println(employee);
        }

        System.out.println("Using the enhanced for-each loop:");
        for (String employee : employees) {
            System.out.println(employee);
        }

        System.out.println("Using the Iterator interface:");
        Iterator<String> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
