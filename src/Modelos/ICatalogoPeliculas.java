package Modelos;

public interface ICatalogoPeliculas {
    void InsertarPelicula(Pelicula nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String nombrePelicula);
}
