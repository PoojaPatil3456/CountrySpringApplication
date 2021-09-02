package org.example;

public class Government {
    String primeMinister;
    int ministries;

    public void setPrimeMinister(String primeMinister) {
        this.primeMinister=primeMinister;
    }

    public void setMinistries(int ministries) {
        this.ministries = ministries;
    }

    public int getMinistries() {
        return ministries;
    }

    public String getPrimeMinister() {
        return primeMinister;
    }

    public String toString(){
        return primeMinister+" "+ministries;
    }


    public void init() throws Exception {
        System.out.println("Init method after properties are set");
    }

    public void destroy() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }
}
