package ej14;

public class EditorVideo {
    
    public void exportar( String formato, String nombre, String duracion){
        Proyecto proyecto = new Proyecto(nombre, duracion);
        Render render = new Render(formato); 
        proyecto.setRender(render);
        System.out.println( "Se ha exportado un proyecto: " + proyecto);
    }
}
