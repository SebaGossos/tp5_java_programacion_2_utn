package ej14;

public class Proyecto {
    private String nombre;
    private String duracion;
    private Render render;

    public Proyecto(String nombre, String duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public void setRender(Render render) {
        this.render = render;
    } 

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracion=" + duracion + ", render=" + render + '}';
    }

    
}
