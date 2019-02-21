import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {


        Set<String> pesels = new HashSet<>();
        Set<String> pesels_BDG = new HashSet<>(Arrays.asList("2222","3333","4444","5555","6666","7777","8888","9999"));

        System.out.println("Dodano? " + pesels.add("1234"));
        System.out.println("Dodano? " + pesels.add("2222"));
        System.out.println("Dodano? " + pesels.add("3333"));
        System.out.println("Dodano? " + pesels.add("8634"));
        System.out.println("Dodano? " + pesels.add("2222"));
        System.out.println("Dodano? " + pesels.add("1234"));

        System.out.println(pesels);

        //Sprawdzamy czy taki jest w zbiorze?
        System.out.println("Przynalezy: "+ pesels.contains("1234"));
        System.out.println("Przynalezy: "+ pesels.contains("0000"));

        pesels.remove("1234");
        System.out.println(pesels);


        Set<String> suma = new HashSet<>();
        Set<String> róznica = new HashSet<>();
        Set<String> iloczyn = new HashSet<>(); //czesc wspolna

        róznica.addAll(pesels);
        róznica.removeAll(pesels_BDG);

        iloczyn.addAll(pesels);
        iloczyn.retainAll(pesels_BDG);

        suma.addAll(pesels);
        suma.addAll(pesels_BDG);
        System.out.println("Po sumowaniu: "+ pesels +" + " +pesels_BDG + " = "+suma);
        System.out.println("Po odejmowaniu: "+ pesels +" - " +pesels_BDG + " = "+róznica);
        System.out.println("Iloczyn: "+ pesels +" * " +pesels_BDG + " = "+iloczyn);

    }
}
