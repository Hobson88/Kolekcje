package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Auto {

    private String vin_no;
    private String brand;
    private String model;
    private double price_basic;
    private List<String> eq_name = new ArrayList<>(Arrays.asList("RadioBluetooth","Automatyczna skrzynia","Autonomiczna jazda"));
    private List<Double> eq_price = new ArrayList<>(Arrays.asList(1200., 10000.,12000.));
    private List<Integer> eq_order = new ArrayList<>(Arrays.asList(0,0,0));
    private List<List> equipment = new ArrayList<>(Arrays.asList(eq_name,eq_price,eq_order));

    public Auto(String vin_no, String brand, String model, double price_basic) {
        this.vin_no = vin_no;
        this.brand = brand;
        this.model = model;
        this.price_basic = price_basic;
    }


    public String getOrderedEquipmentNames (){
        String equipmentNames = "";
            for (int i = 0;i<eq_name.size();i++){
                if (eq_order.get(i)!=0){
                    equipmentNames += (eq_name.get(i)+", ");
                }
            }
            return equipmentNames.equals("") ? equipmentNames : equipmentNames.substring(0, equipmentNames.length()-2);
    }

    public double calcFullPrice(){
        double price_full = price_basic;
        for (int i = 0;i<eq_name.size();i++){
            if (eq_order.get(i)!=0){
                price_full += eq_price.get(i);
            }
        }
        return price_full;
    }

    public void addExtraEquipmentByName(String equipment){
         int index = eq_name.indexOf(equipment);
         eq_order.set(index, 1);
    }


    public String getVin_no() {
        return vin_no;
    }

    public void setVin_no(String vin_no) {
        this.vin_no = vin_no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice_basic() {
        return price_basic;
    }

    public void setPrice_basic(double price_basic) {
        this.price_basic = price_basic;
    }

    @Override
    public String toString() {
        return String.format("%10s | %10s | %10s | %10.2f | %50s | %10.2f ", vin_no, brand, model, price_basic, getOrderedEquipmentNames(),calcFullPrice());
    }



}
