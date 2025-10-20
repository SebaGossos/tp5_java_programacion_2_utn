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
//import ej4.Banco;
//import ej4.Cliente;
//import ej4.TarjetaDeCredito;

//5)
//import ej5.Computadora;
//import ej5.PlacaMadre;
//import ej5.Propietario;

//6)
import ej6.Cliente;
import ej6.Mesa;
import ej6.Reserva;

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
//        Banco banco = new Banco("BBVA","234234234");
//        Cliente cliente = new Cliente("Seba","22356465");
////        Agrupacion
//        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("8234234", "4 de agosto 2029", banco);
//        
////        Asociacion Bidireccional
//        tarjetaDeCredito.setCliente(cliente);
//        
//        System.out.println(tarjetaDeCredito);

////        5)
//        Propietario propietario = new Propietario("Seba", "342435345");
//        Computadora computadora = new Computadora( "lenovo", "797y", "b450", "am5" );
//        
//        computadora.setPropietario(propietario);
//        
//        System.out.println(computadora);

////        6)
        Mesa mesa = new Mesa("234523","40");
//        Agregacion
        Reserva reserva = new Reserva("3 de abril 1998", "16:43", mesa);
        Cliente cliente = new Cliente( "seba", "879834223");
//        Asociacion
        reserva.setCliente(cliente);
        
        System.out.println(reserva);

        
        
        
        
        
    }
    
}
