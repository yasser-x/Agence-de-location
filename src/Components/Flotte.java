package Components;

import java.util.List;

public class Flotte {
    private static List<Vehicule> vehicules ;
    private static List<Modele> modeles ;



    public static void addVehicule(Vehicule vhc){
        vehicules.add(vhc) ;
    }
}
