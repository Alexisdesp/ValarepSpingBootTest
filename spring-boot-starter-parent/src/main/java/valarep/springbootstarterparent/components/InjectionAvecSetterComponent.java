package valarep.springbootstarterparent.components;

import valarep.springbootstarterparent.services.ServiceBonjour;

public class InjectionAvecSetterComponent {

    private ServiceBonjour serviceBonjour;

    public String direBonjour() {
        return serviceBonjour.bonjour();
    }

    public void setServiceBonjour(ServiceBonjour service) {
serviceBonjour = service;
    }
}
