import java.util.ArrayList;
import java.util.Arrays;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.AddFront("World!");
        myLinkedList.AddFront("Hello");
        System.out.println(myLinkedList);
    }
    
}