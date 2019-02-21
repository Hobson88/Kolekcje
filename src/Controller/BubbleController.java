package Controller;

import java.util.ArrayList;
import java.util.List;

public class BubbleController {

    private List<Integer> temp = new ArrayList<>();

    public List<Integer> sortASC(List<Integer> list) {
        temp = list;
        int licznik;
        for (int i = 1; i < temp.size(); i++) {
            //pętla iterująca po wartościach
            licznik = 0;
            for (int j = 1; j < temp.size(); j++) {

                if (temp.get(j - 1) > temp.get(j)) {
                    swap(j - 1, j);
                    licznik++;
                }
            }
            if (licznik == 0) {
                System.out.println("koniec sortowania");
                break;
            }

            System.out.println(i + " " + temp);
        }
        return temp;
    }

    public List<Integer> sortDESC(List<Integer> list) {
        temp = list;
        int licznik;
        for (int i = 1; i < temp.size(); i++) {
            //pętla iterująca po wartościach
            licznik = 0;
            for (int j = 1; j < temp.size(); j++) {

                if (temp.get(j - 1) < temp.get(j)) {
                    swap(j - 1, j);
                    licznik++;
                }
            }
            if (licznik == 0) {
                System.out.println("koniec sortowania");
                break;
            }

            System.out.println(i + " " + temp);
        }
        return temp;
    }



    public void swap(int index1, int index2) {
        int tempIndex = temp.get(index1);
        temp.set(index1, temp.get(index2));
        temp.set(index2, tempIndex);
   }
}
