package main;
//1)
//import ej1.Pasaporte;
//import ej1.Titular;

//2)
//import ej2.Bateria;
//import ej2.Celular;
//import ej2.Usuario;

//3)
//import ej3.Autor;
//import ej3.Editorial;
//import ej3.Libro;

//4)
import ej4.Banco;
import ej4.Cliente;
import ej4.TarjetaDeCredito;

public class Main {

    public static void main(String[] args) {
////        1)
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
        

////        2)
////        Agregacion
//        Bateria bateria1 = new Bateria("modelo2", "5000");
//        Celular celu = new Celular("imei1", "motorola", "G40", bateria1);
//        
////        Asociacion bidireccional
//        Usuario usuario1 = new Usuario("Seba", "3234234");
//        celu.setUsuario(usuario1);
//        
//        //Imprimimos desde usuario para corroborar la asociacion
//        System.out.println(usuario1.getCelular());  


////        3)
//        Autor autor = new Autor("jk rowgling", "UK" );
//        Editorial editorial = new Editorial("Warner", "USA");
////       Agregacion
//        Libro libro = new Libro("harry potter", "UK", editorial);
//        
////        Asociacion unidireccional
//        libro.setAutor( autor );
//        
//        System.out.println(libro);

////        4)
        Banco banco = new Banco("BBVA","234234234");
        Cliente cliente = new Cliente("Seba","22356465");
        TarjetaDeCredito tarjetaDeCredito("8234234", "4 de agosto 2029", banco);
        
        tarjetaDeCredito.setCliente(cliente);
        System.out.println(tarjetaDeCredito);
    }
    
}
