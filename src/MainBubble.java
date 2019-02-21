import Controller.BubbleController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBubble {


    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(341,5,45,3434,367,5,1,3,6,8,334,1,6,45,14,34,7,67,34,46,42,98,56,34));
        BubbleController bc = new BubbleController();
        System.out.println(bc.sortASC(myList));
      //  System.out.println(bc.sortDESC(myList));
    }
}
