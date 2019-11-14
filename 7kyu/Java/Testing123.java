import java.util.*;

public class Testing123 {
    public static List<String> number(List<String> lines) {

        int count = 1;
        for(String str : lines){
            myList.add(count + ": " + str);
            count ++;
        }

        return myList;
    }

    public static void main (String [] args){
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");

        list2.add("a");
        list2.add("b");
        list2.add("a");
        list2.add("b");
        list2.add("x");

        list1 = number(list1);
        list2 = number(list2);

        for(String str : list1){
            System.out.println("List 1 :: " + str);
        }

        System.out.println("\n");

        for(String str : list2){
            System.out.println("List 2 :: " + str);
        }
    }
}
