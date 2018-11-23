

package raktarprogram;


public class Aru {

    private String nev;
    private double egysegar;
    private double mennyiseg;
    
    public Aru(String aNev, double aEgysegar){
        this.nev = aNev;
        this.egysegar = aEgysegar;
        this.mennyiseg = 0;
    }
    public String getNev(){
        return nev;
    }
    public double getEgysegar(){
        return egysegar;
    }
    public void setEgysegar(double aEgysegar){
        if (egysegar >= 0) {
            egysegar = aEgysegar;
        }
    }
    public double getMennyiseg(){
        return mennyiseg;
    }
    public double getAr(){
        return mennyiseg * egysegar;
    }
    public void hozzatesz(double aMennyiseg){
        if (aMennyiseg > 0) {
            mennyiseg += aMennyiseg;
        }
    }
    public void elvesz(double aMennyiseg){
        if (aMennyiseg > 0 && aMennyiseg <= mennyiseg) {
            mennyiseg -= aMennyiseg;
            if (mennyiseg <= 0) {
                System.out.println("Nincs már mit elvenned!");
                return;
            }
        } 
    }
    public String tostring(){
        return nev + "\tEgységár: " + egysegar + "\tMennyiség: "
                + mennyiseg + "\tÁr: " + getAr();
    }
    
}
