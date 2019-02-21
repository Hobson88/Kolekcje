package Controller;

import Model.Auto;

import java.util.ArrayList;
import java.util.List;

public class AutoFactory {
    private List<Auto> ordered_autos = new ArrayList<>();

    public void purchaseAuto(String vin_no, String brand, String model, double price_basic){
        Auto a = new Auto(vin_no, brand, model, price_basic);
        ordered_autos.add(a);
    //    System.out.println("Zamówienie przyjęte: "+ a);
    }

    public void getAllAutos(){
        ordered_autos.forEach(auto -> System.out.println(auto));
    }



    public void addExtraEquipment (String vin_no, String name){
        for (int i = 0; i< ordered_autos.size();i++){
            if (ordered_autos.get(i).getVin_no().equals(vin_no)){
                ordered_autos.get(i).addExtraEquipmentByName(name);
            }
        }
    }


}
