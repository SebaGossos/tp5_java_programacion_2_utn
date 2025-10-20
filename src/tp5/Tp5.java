package tp5;
import ej1.Pasaporte;
import ej1.Foto;
import ej1.Titular;

public class Tp5 {

    public static void main(String[] args) {
        //Composicion
        Pasaporte pasaporte1 = new Pasaporte(31231, "julio 2025", "lago", "16-9");
        System.out.println(pasaporte1);
        
        //Asociacion bidireccional
        Titular titular1 = new Titular("Seba", "2342342");

        pasaporte1.setTitular(titular1);
        System.out.println(pasaporte1);
        
    }
    
}
