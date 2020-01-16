package valarep.springbootstarterparent.components;

import valarep.springbootstarterparent.services.ServiceBonjour;

public class InjectionDirectComponent {

    public ServiceBonjour serviceBonjour;

    public String direBonjour() {
        return serviceBonjour.bonjour();
    }

}
