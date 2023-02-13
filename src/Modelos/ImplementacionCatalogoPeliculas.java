package Modelos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ImplementacionCatalogoPeliculas implements ICatalogoPeliculas{
    private final ArrayList<String> listaPeliculas;
    
    public ImplementacionCatalogoPeliculas() {
        this.listaPeliculas = new ArrayList<>();
    }

    @Override
    public void InsertarPelicula(Pelicula nombrePelicula) {
       this.listaPeliculas.add(nombrePelicula.toString());
        
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado=null;
        for(var pelicula:this.listaPeliculas){
            if(nombrePelicula.equals(pelicula)){
                resultado=pelicula;
                break;
            }else{resultado=pelicula;}
        }
        if(nombrePelicula.equalsIgnoreCase(resultado)){
            JOptionPane.showMessageDialog(null, "Resultado: "+resultado, "Buscar Pelicula", 3, null);
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro la pelicula: "+nombrePelicula, "Buscar Pelicula", 0, null);
        }
    }

    @Override
    public void listarPelicula() {
        JOptionPane.showMessageDialog(null, this.listaPeliculas, "Peliculas", 3);
        
    }
    
}
