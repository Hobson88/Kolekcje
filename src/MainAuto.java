import Controller.AutoFactory;

public class MainAuto {

    public static void main(String[] args) {

        AutoFactory af = new AutoFactory();

        af.purchaseAuto("0001","BMW","7",150000);
        af.purchaseAuto("0002","BMW","5",130000);
        af.purchaseAuto("0003","BMW","3",110000);
        af.purchaseAuto("0004","Fiat","Ducato",160000);
        af.purchaseAuto("0005","VW","Passat",10000);
        af.purchaseAuto("0006","Seat","Ibiza",12000);
        af.purchaseAuto("0007","Ford","Mustang",360000);
        af.addExtraEquipment("0001","RadioBluetooth");
        af.addExtraEquipment("0005","RadioBluetooth");
        af.addExtraEquipment("0005","Autonomiczna jazda");
        af.addExtraEquipment("0002","Autonomiczna jazda");
        af.addExtraEquipment("0001","Autonomiczna jazda");
        af.getAllAutos();

    }

}
