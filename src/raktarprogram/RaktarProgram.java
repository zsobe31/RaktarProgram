

package raktarprogram;


public class RaktarProgram {

    private Aru aru;
    
    public RaktarProgram(){
        aru = new Aru("Paradicsom", 300);
    }
    public void akciok(){
        aru.hozzatesz(125);
        
    }
    
    
    public static void main(String[] args) {

        RaktarProgram rp = new RaktarProgram();
        
        Aru tojas = new Aru("Tojás",100);
        System.out.println(tojas.tostring());
        tojas.hozzatesz(500);
        System.out.println(tojas.tostring());
        
        Aru par = new Aru("Paradicsom", 250);
        par.hozzatesz(150);
        System.out.println(par.tostring());
        par.setEgysegar(200);
        System.out.println(par.tostring());
        par.elvesz(100);
        System.out.println(par.tostring());
        par.elvesz(50);
        System.out.println(par.tostring());
        par.elvesz(100);
        System.out.println(par.tostring());
        par.elvesz(100);
        System.out.println(par.tostring());

    }

}
