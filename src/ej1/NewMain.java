package ej1;

import ej1.Pasaporte;
import ej1.Titular;

public class NewMain {

    public static void main(String[] args) {
        //Composicion
        Pasaporte pasaporte1 = new Pasaporte(31231, "julio 2025", "lago", "16-9");
        System.out.println(pasaporte1);
        
        //Asociacion bidireccional
        Titular titular1 = new Titular("Seba", "2342342");
        pasaporte1.setTitular(titular1);
        
        System.out.println(pasaporte1);
        System.out.println(titular1.getPasaporte());
        
    }
    
}
