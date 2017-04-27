package Chapter6;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
//        System.out.println("Enter a number: ");
//        int n = reader.nextInt(); // Scans the next token of the input as an int.

        System.out.println("Please enter a postfix calculation to be done:");
        String input = reader.nextLine();
        String[] newinput = input.split("\\s");

        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 0; i<newinput.length;i++)
        {
            list.addLast(newinput[i]);
            System.out.println(newinput[i]);
        }
        System.out.println("Postfix laoded" );

    }

    public static void postFix(SinglyLinkedList list)
    {
        int x; int y;
        for (int i = 0; i<list.size();i++)
        {
            if (Character.isDigit(list[i]))
            {

            }
        }
    }
}
