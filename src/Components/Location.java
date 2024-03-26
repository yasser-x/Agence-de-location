package Components;

import java.util.Date;

public class Location {
    private Client client  ;
    private Vehicule vehicule ;
    private Date dateDebut  ;
    private Date dateFin  ;
    private String modeLocation ;

    public Location(Client client , Vehicule vehicule ){
        this.client = client ;
        this.vehicule = vehicule ;

    }

}
