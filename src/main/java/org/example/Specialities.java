package org.example;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
public class Specialities {
    List trophies;
    Set wonders;
    Map populationOfStates;
    Properties famousFoodOfStates;

    public void setTrophies(List trophies) {
        this.trophies = trophies;
    }

    public List getTrophies() {
        System.out.println("Trophies:"  + trophies);
        return trophies;
    }

    public void setWonders(Set wonders) {
        this.wonders = wonders;
    }

    public Set getWonders() {
        System.out.println("Wondres:"+wonders);
        return wonders;
    }

    public void setPopulationOfStates(Map populationOfStates) {
        this.populationOfStates = populationOfStates;
    }

    public Map getPopulationOfStates() {
        System.out.println("Population:"+populationOfStates);
        return populationOfStates;
    }

    public void setFamousFoodOfStates(Properties famousFoodOfStates) {
        this.famousFoodOfStates = famousFoodOfStates;
    }

    public Properties getFamousFoodOfStates() {
        System.out.println("Famous Food:"+famousFoodOfStates);
        return famousFoodOfStates;
    }
}
