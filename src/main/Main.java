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
//import ej6.Cliente;
//import ej6.Mesa;
//import ej6.Reserva;

//7)
//import ej7.Vehiculo;
//import ej7.Conductor;
//import ej7.Motor;

//8)
//import ej8.Documento;
//import ej8.FirmaDigital;
//import ej8.Usuario;

//9)
//import ej9.CitaMedica;
//import ej9.Paciente;
//import ej9.Profesional;

//10)
//import ej10.ClaveSeguridad;
//import ej10.CuentaBancaria;
//import ej10.Titular;

//11)
//import ej11.Artista;
//import ej11.Cancion;
//import ej11.Reproductor;

//12)
//import ej12.Calculadora;
//import ej12.Contribuyente;
//import ej12.Impuesto;

//13)
//import ej13.CodigoQR;
//import ej13.GeneradorQR;
//import ej13.Usuario;

//14)
//import ej14.EditorVideo;
//import ej14.Proyecto;
//import ej14.Render;


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
//        Mesa mesa = new Mesa("234523","40");
////        Agregacion
//        Reserva reserva = new Reserva("3 de abril 1998", "16:43", mesa);
//        Cliente cliente = new Cliente( "seba", "879834223");
////        Asociacion
//        reserva.setCliente(cliente);
//        
//        System.out.println(reserva);

////        7)
//        Motor motor = new Motor("Gasoil", "245hg");
//        Conductor conductor = new Conductor( "Seba", "arg");
//        
////        Agregacion motor
//        Vehiculo vehiculo = new Vehiculo("asd354", "Toyota", motor);
////        Asociacion bidireccional
//        vehiculo.setConductor(conductor);
//        
//        System.out.println(vehiculo);
        
////        8)
//        Usuario usuario = new Usuario("Seba", "seba@gmail.com");
//        
//        Documento documento = new Documento("buenos dias", "saludos", "2234h", "2 de enero 2020", usuario);
//        System.out.println(documento);

////         9)
//        Paciente paciente = new Paciente("Seba", "osde");
//        Profesional profesional = new Profesional("Programador","backend");
//        
//        CitaMedica citaMedica = new CitaMedica("23 de diciembre", "12:33");
//        
////        Asociacion Unidireccional
//        citaMedica.setPaciente(paciente);
//        citaMedica.setProfesional(profesional);
//        
//        System.out.println(citaMedica);

////          10)
        
//        CuentaBancaria cuentaBancaria = new CuentaBancaria("234324", "200000", "23423477777", "23 de marzo 2024");
//        Titular titular = new Titular("Seba", "234523423");
//        
////        Asocicacion bidireccional
//        cuentaBancaria.setTitular(titular);
//        System.out.println(cuentaBancaria);

////         11)
//        Artista artista = new Artista( "bad bunny", "Trap");
//        Cancion cancion = new Cancion( "un verano sin ti");
////        Asociacion unidireccional
//        cancion.setArtista(artista);
//        
////        Dependencia de uso
//        Reproductor reproductor = new Reproductor();
//        reproductor.reproducir(cancion);
        
////            12)
//        Contribuyente contribuyente = new Contribuyente("Seba", "234324");
//        Impuesto impuesto = new Impuesto("30000");
////        Asociacion Unidireccional
//        impuesto.setContribuyente(contribuyente);
////        Dependecia de uso
//        Calculadora calculadora = new Calculadora();
//        calculadora.calcular(impuesto);

////            13)
////         Dependencia de Creacion
//           GeneradorQR generadorQR = new GeneradorQR();
//           generadorQR.generar( "jshda23", "pedro", "pedro@gmail.com");
           
//           14)
//            Dependencia de Creacion
//            EditorVideo editorVideo = new EditorVideo();
//            editorVideo.exportar("234jsd", "proof", "1hs");
    }
    
}
