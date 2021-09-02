package org.example;

public class Maharashtra {
    private  int noOfStates;
    private int noOfDistricts;
    private String language;
    private String flag;
    private Government government;
    public Specialities specialities;


    public Maharashtra(int id, String name) {
        this.noOfStates = id;
        this.flag = name;
    }

    public int getNoOfDistricts() {
        return noOfDistricts;
    }

    public void setNoOfDistricts(int noOfDistricts) {
        this.noOfDistricts = noOfDistricts;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public void setGovernment(Government government) {
        this.government = government;
    }

    public Government getGovernment() {
        return government;
    }
    public void display(){
        System.out.println("Maharashtra: No of States:"+noOfDistricts+" Language:"+language+" Government Info:"+government+" Flag:"+flag+"specialities"+specialities);

    }
}
