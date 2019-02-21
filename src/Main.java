import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        System.out.println(fruits.size());

        //dodawanie do listy
        fruits.add("Jabłuszko");
        fruits.add("Gruszka");
        fruits.add("Pomidor");
        fruits.add("Ogórek");
        fruits.add("Mandarynka");
        //dodawanie na dowolnym indexie (bez usuwania, tylko rozszerzająć)
        fruits.add(1,"Mango");
        //wyrażenie lambda
        //
     //   fruits.forEach(f -> System.out.print(f));

        System.out.println(fruits);

        //zmiana indexu
        fruits.set(1, "Kaka");
        System.out.println(fruits);

        //Usuwanie po nazwie obiektu
        fruits.remove("Gruszka");
        System.out.println(fruits);
        //Usuwanie po indexie Listy
        fruits.remove(0);
        System.out.println(fruits);
       // System.out.println(fruits);


        System.out.println(fruits.get(0));

        //Inicjalizacja listy wartościami początkami


        List<String> brands = new ArrayList<>(Arrays.asList("BMW","Audi","VW","Toyota","Toyota"));
        brands.add("Porsche");





    }


}
