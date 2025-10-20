package ej5;

public class Computadora {
    private String marca;
    private String numeroDeSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroDeSerie, String modelo, String chipset ) {
        this.marca = marca;
        this.numeroDeSerie = numeroDeSerie;
//        composicion
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        if( propietario == this.propietario ) return;
        this.propietario = propietario;
        if( propietario != null && propietario.getComputadora() != this ) {
            propietario.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroDeSerie=" + numeroDeSerie + ", placaMadre=" + placaMadre + ", propietario=" + propietario + '}';
    }
    
    
    
}
