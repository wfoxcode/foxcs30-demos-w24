import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Normal string array of size 10
        String[] namesArray = new String[10];

        // Creates a blank string Array list
        List<String> namesList = new ArrayList<String>();

        // Adding elements to Array List

        namesList.add("Wolf");
        namesList.add("Fox");

        // Add to a particular position
        namesList.add(1,"Sutter");

        System.out.println( namesList );
        System.out.println( namesList.size() ); //.size() instead of length

        // Retrieve an element from ArrayList

        System.out.println( namesList.get(0) );

        // Remove Elements from ArrayList

        namesList.remove(0); //Remove element 0
        System.out.println(namesList);


//--------------------------------------------------------
        System.out.println("----------");
        
        // ArrayList with Numbers
        List numList = new ArrayList();

        numList.add(4);

        numList.add(0,7);

        System.out.println(numList);
        System.out.println(numList.size());

    }
}
