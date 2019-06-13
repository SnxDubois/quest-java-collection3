
/*import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;*/
import java.util.*;

public class SetExample {

    public static void main(String... args) {

        //This example creates a HashSet which is one of the classes in the Java APIs that implement the Set interface. 
        //Then it adds a string object to the set, and finally it checks if the set contains the element just added. 
        Set setA = new HashSet<>();
        String element = "element 1";
        setA.add(element);
        System.out.println(setA.contains(element));

        //Here are a few examples of how to create a Set instance: 
        Set setB = new EnumSet();
        Set setC = new HashSet<>();
        Set setD = new LinkedHashSet();
        Set setE = new TreeSet();

        //Add Element to Set
        //The three add() calls add a String instance to the set. 
        setA.add("element 2");
        setA.add("element 3");
        setA.add("element 4");

        //Iterate Set Elements
        //Here is an example of obtaining an Iterator from a Set: 
        Iterator iterator = set.iterator();
        while (iterator.hasNext() {
            String element = (String) iterator.next();
        }

        //Here is how iterating the elements of a Set using a for-each loop looks: 
        for (Object object : set) {
            String element = (String) object;
        }

        //Here is an example of creating a Java Stream from a Set and iterate the Stream: 
        Set set = new HashSet();
        set.add("one");
        set.add("two");
        set.add("three");
        Stream stream = set.stream();
        Stream.forEach(element -> { 
            System.out.println(element);
        });

        //Remove Elements From Set
        //Here is an example of removing all elements from a Java Set: 
        set.clear();

        //Add All Elements From Another Collection
        //Here is an example of adding all elements from another Set to a Java Set: 
        Set set2 = new HashSet();
        set2.add("four");
        set2.addAll(set);

        //Remove All Elements From Another Collection
        //Here is an example of removing all elements from a Java Set which are also present in another Collection: 
        Set set3 = new HashSet();
        set3.add("Three");
        set.removeAll(set3);

        //Retain All Elements Present in Another Collection
        //Here is an example of retaining all elements in a Java Set which are also present in another Set: 
        Set set4 = new HashSet();
        set4.add("two");
        set.retainAll(set4);

        //Set Size
        //Here is an example of reading the size of a Java Set: 
        int size = set.size();

        //Check if Set is Empty
        //Here is an example of checking if a Java Set is empty: 
        boolean isEmpty = set.isEmpty();

        //Check if Set Contains Element
        //Here is an example of checking if a Java Set contains a given element: 
        Set set5 = new HashSet();
        set5.add("123");
        set5.add("456");
        boolean contains123 = set.contains("123");

        //Convert Java Set to List
        //Here is an example of converting a Java Set to a List: 
        List list = new ArrayList();
        list.addAll(set5);
    }
}