package ej13;

public class Usuario {
    private String nombre;
    private String email;
    private CodigoQR codigoQR;
    

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public CodigoQR getCodigoQR() {
        return codigoQR;
    }

    public void setCodigoQR(CodigoQR codigoQR) {
        this.codigoQR = codigoQR;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", email=" + email + ", codigoQR=" + codigoQR + '}';
    }
    
}
