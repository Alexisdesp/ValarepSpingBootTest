package valarep.springbootstarterparent.components;

import valarep.springbootstarterparent.services.ServiceBonjour;

public class InjectionParConstructeurComponent {

    private ServiceBonjour serviceBonjour;

    public InjectionParConstructeurComponent(ServiceBonjour serviceBonjour){
        this.serviceBonjour = serviceBonjour;

    }
    public String direBonjour(){
        return serviceBonjour.bonjour();
    }
}