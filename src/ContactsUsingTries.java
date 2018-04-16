import java.util.ArrayList;
import java.util.Scanner;

/**
 * We're going to make our own Contacts application! The application must perform two types of operations:

 add name, where  is a string denoting a contact name. This must store  as a new contact in the application.
 find partial, where  is a string denoting a partial name to search the application for. It must count the number of contacts starting with  and print the count on a new line.
 Given  sequential add and find operations, perform each operation in order.
 */
public class ContactsUsingTries {
    private static ArrayList<String> lsContacts = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if (op.equals("add")) lsContacts.add(contact);
            else findContact(contact);
        }
    }

    private static void findContact(String partial) {
        int count = 0;
        for (String contact : lsContacts){
            if (contact.contains(partial)) count++;
        }
        System.out.println(count);
    }
}
