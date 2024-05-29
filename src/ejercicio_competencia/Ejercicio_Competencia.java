
package ejercicio_competencia;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Ejercicio_Competencia {

    public static void main(String[] args) {
       boolean x=(true);
       while (x){
           String menu = JOptionPane.showInputDialog("***COMPETENCIA***\n"+
                "1. Registrar Atleta\n"+
                "2. Datos del Campeón\n"+
                "3. Atletas por País\n"+
                "4. Tiempo Promedio de los Atletas\n"+
                "5. Salir");
           int opcion = Integer.parseInt(menu);
           switch (opcion){
               case 1:
                   Competencia competidores = new Competencia();
                   competidores.nuevoAtleta();
                   competidores.atletaDos();
                   competidores.atletaTres();
                   competidores.mostrarAtleta();
                   
                   break;
               case 2:
                   
                   break;
               case 3:
                   Competencia listaPais = new Competencia();
                   listaPais.atletasPorPais();                  
                   break;
               case 4:
                   break;
               case 5:
                   break;
                  
                  
           }
                   
       }
    }
    
}
