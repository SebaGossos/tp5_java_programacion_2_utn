package ej10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        if( this.cuentaBancaria == cuentaBancaria ) return;
        this.cuentaBancaria = cuentaBancaria;
        if( cuentaBancaria != null && cuentaBancaria.getTitular()!= this ) {
            cuentaBancaria.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", cuentaBancaria=" + cuentaBancaria.getCbu() + '}';
    }
    
    
    
    
    
}
