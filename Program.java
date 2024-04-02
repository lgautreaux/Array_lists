import java.util.ArrayList;
import java.util.Arrays;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4 };
        int[] arr1 = new int[3];

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));


        ArrayList<Integer> arrList1 = new ArrayList<Integer>();

        arrList1.add(5);
        arrList1.add(10);

        ArrayList<Integer> arrList = new ArrayList<Integer>(arrList1);

        arrList.add(1);
        arrList.add(3);
        arrList.add(4);
        // arrList.addAll(arrList1);

        MyArrayList<Integer> myFirstList = new MyArrayList<Integer>();
        myFirstList.AddEnd(3);
        myFirstList.AddEnd(7);
        myFirstList.AddEnd(1);
        //myFirstList.Print();
        myFirstList.AddStart(2);
        //myFirstList.Print();
        myFirstList.AddAtIndex(300, 2);
        //myFirstList.Print();
        myFirstList.AddAtIndex(800, -1);
        //myFirstList.Print();
        myFirstList.AddAtIndex(900, 100);
        myFirstList.Print();

        try{
        myFirstList.DeleteAtIndex(3);
        myFirstList.Print();
        } catch (Exception exception){
            System.out.println(exception);
        }
        System.out.println("is list Clear?");
        System.out.println(myFirstList.IsEmpty());
        System.out.print("What is the size? ");
        System.out.println(myFirstList.Size());

        myFirstList.ClearAll();
        System.out.println("Clear List Complete");
        myFirstList.Print();
        System.out.println(myFirstList.IsEmpty());
        
        //System.out.println(myFirstList.GetElementAtIndex(1));

        MyArrayList<String> mySecondList = new MyArrayList<String>();
        mySecondList.AddStart("Hi");
        mySecondList.AddEnd("Everyone");
        mySecondList.Print();
        mySecondList.ClearAll();
        mySecondList.Size();
        mySecondList.Print();
    }
    
}