package peliculasui;

import javax.swing.JOptionPane;

import Modelos.ICatalogoPeliculas;
import Modelos.ImplementacionCatalogoPeliculas;
import Modelos.Pelicula;

public class UIPeliculas {
    public static void interfazUsuario(){
        ICatalogoPeliculas peliculas= new ImplementacionCatalogoPeliculas();
        Pelicula pelicula;
        CERRAR:
        while(true){
            String opcion=JOptionPane.showInputDialog(null, "1.Insertar Pelicula\n"
            +"2- Listar Pelicula\n"+
            "3- Buscar Pelicula \n"+
            "4- Salir","Ingrese una opción",3);
            int opcionint=0;
            try{
                opcionint=Integer.parseInt(opcion);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Deben ser numeros enteros", "Error", 0, null);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e, "Error", 0, null);
            }
            
            switch(opcionint){
                case 1:
                String nombrePelicula=JOptionPane.showInputDialog(null, "Ingrese el nombre de la pelicula","Entrada",3);
                pelicula=new Pelicula(nombrePelicula);
                peliculas.InsertarPelicula(pelicula);
                break;

                case 2:
                peliculas.listarPelicula();
                break;
                
                case 3:
                nombrePelicula=JOptionPane.showInputDialog(null, "Ingrese la pelicula","Buscar",3);
                peliculas.buscarPelicula(nombrePelicula);
                break;

                case 4:
                break CERRAR;

                default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta, solo de 1 al 4","Error",0);
            }
        }
    }
}
