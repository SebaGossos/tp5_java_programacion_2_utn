package ej13;

public class GeneradorQR {
    
    public void generar( String codigo, String nombre, String email ) {
//        Dependencia de Creacion
        Usuario usuario = new Usuario(nombre, email);
        CodigoQR codigoQR = new CodigoQR(codigo);
        usuario.setCodigoQR(codigoQR);
        
        System.out.println("El codigo " + codigo + " del usuario " + usuario + " ha sido creado!");
    }
}
