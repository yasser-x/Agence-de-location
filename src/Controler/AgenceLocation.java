package Controler;

import Components.*;

import java.util.*;

public class AgenceLocation {
    Map<Integer , Modele> modeles = new HashMap<Integer, Modele>() ;
    Map<Integer , Vehicule > vehicules = new HashMap<Integer, Vehicule>() ;
    Map<Integer , Client> clients = new HashMap<Integer , Client>() ;
    Map<Client,List<Location> > locations = new HashMap<Client , List<Location>>() ;


    public Client indiquerClient(Integer Id) {
        if (this.clients.containsKey(Id)) return this.clients.get(Id)  ;
        throw new RuntimeException("client introuvable") ;

    }
    public Modele indiquerModele(Integer Id){
        if (this.modeles.containsKey(Id)) return this.modeles.get(Id) ;

        throw new RuntimeException("modele introuvable") ;
    }

    public Vehicule indiquerVehicule(Integer numeroInterne){
        if (this.vehicules.containsKey(numeroInterne)) return  this.vehicules.get(numeroInterne) ;
        throw new RuntimeException("vehicule non enregistree") ;
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt();
    }

    public void ajouterVehicule(Integer Id){
        Modele mdl = indiquerModele(Id) ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Entrer le numéro de plaque : ");
        String numeroPlaque = sc.next() ;
        System.out.println("Entrer le prix de location par jour");
        Integer prixLocation = sc.nextInt();
        Integer numéroInterne = generateRandomNumber() ;

        Vehicule vehicule = new Vehicule(mdl , numeroPlaque , prixLocation , numéroInterne) ;
        Flotte.addVehicule(vehicule);
    }

    public void ajouterLocation(Integer Id , Integer numeroInterne) {
        Vehicule v = indiquerVehicule(numeroInterne) ;
        Client c = indiquerClient(Id) ;
        Location location = new Location(c , v );
        List<Location> locations = this.locations.get(c) ;
        this.locations.put(c , locations) ;

    }

}
