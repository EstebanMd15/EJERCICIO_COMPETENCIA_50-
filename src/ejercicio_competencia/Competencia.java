
package ejercicio_competencia;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Competencia {
    ArrayList<Atleta>listaAtletas = new ArrayList<Atleta>();
    
    public void nuevoAtleta(){
        String nombreAtleta=JOptionPane.showInputDialog("Nombre Primer Atleta");
        String nacionalida=JOptionPane.showInputDialog("Nacionalida Primer Atleta");
        double tiempo=Double.parseDouble(JOptionPane.showInputDialog("Tiempo Primer Atleta"));
        Atleta nuevoAtleta = new Atleta(nombreAtleta, nacionalida, tiempo);
       
        listaAtletas.add(nuevoAtleta);

    }
    public void atletaDos(){
        String nombreAtleta=JOptionPane.showInputDialog("Nombre Segundo Atleta");
        String nacionalida=JOptionPane.showInputDialog("Nacionalida Segundo Atleta");
        double tiempo=Double.parseDouble(JOptionPane.showInputDialog("Tiempo Segundo Atleta"));
        Atleta Atletados = new Atleta(nombreAtleta, nacionalida, tiempo);
        
        listaAtletas.add(Atletados);
     }
    public void atletaTres(){
        String nombreAtleta=JOptionPane.showInputDialog("Nombre Tercer Atleta");
        String nacionalidad=JOptionPane.showInputDialog("Nacionalidad Tercer Atleta");
        double tiempo=Double.parseDouble(JOptionPane.showInputDialog("Tiempo Tercer Atleta"));
        Atleta AtletaTres = new Atleta(nombreAtleta, nacionalidad, tiempo);
        
        listaAtletas.add(AtletaTres);
    }
        public void mostrarAtleta(){
           
        for (Atleta a: listaAtletas){
            System.out.println("Nombre: "+ a.getNombre()+". Nacionalidad: "+a.getNacionalidad()
            +". Tiempo: "+a.getTiempo());
        }    
        }
       
        public static void atletasPorPais(){
            String nacionalidad=JOptionPane.showInputDialog("Ingrese la Nacionalidad");
            ArrayList listanacionalidad = new ArrayList();
            listanacionalidad.add("Juan");
            listanacionalidad.add("Esteban");
            listanacionalidad.add("Pedro");
            listanacionalidad.add("Jesus");
            System.out.println("Lista de nombres;"+listanacionalidad);
        }
   
           
       }
  

        


