package main;
//1)
//import ej1.Pasaporte;
//import ej1.Titular;

//2)
import ej2.Bateria;
import ej2.Celular;
import ej2.Usuario;

public class Main {

    public static void main(String[] args) {
//        1)
//        //Composicion
//        Pasaporte pasaporte1 = new Pasaporte(31231, "julio 2025", "lago", "16-9");
//        System.out.println(pasaporte1);
//        
//        //Asociacion bidireccional
//        Titular titular1 = new Titular("Seba", "2342342");
//        pasaporte1.setTitular(titular1);
//        
//        System.out.println(pasaporte1);
//        System.out.println(titular1.getPasaporte());
        
//        2)
//        Agregacion
        Bateria bateria1 = new Bateria("modelo2", "5000");
        Celular celu = new Celular("imei1", "motorola", "G40", bateria1);
        System.out.println(celu);
        
//        Asociacion bidireccional
        Usuario usuario1 = new Usuario("Seba", "3234234");
        System.out.println(usuario1);
        celu.setUsuario(usuario1);
        
        
        System.out.println(celu);
    }
    
}
