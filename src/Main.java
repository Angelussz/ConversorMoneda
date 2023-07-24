import com.moneda.*;
import com.opciones.OpcionMoneda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<String> opciones = new ArrayList<String>();
        opciones.add("conversor de monedas");
        opciones.add("Conversor de temeperaturas");
        OpcionMoneda opcionMoneda = new OpcionMoneda();
        Object[] opcionesArray = opciones.toArray();

        int indice;
        Double valor = null;
        do {
            Object seleccion = JOptionPane.showInputDialog(
                    null, // Componente padre
                    "Elige que desea convertir", // Mensaje
                    "Lista con JoptionPane", // Título
                    JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje
                    null, // Icono
                    opcionesArray, // Arreglo de opciones
                    opcionesArray[0] // Opción por defecto
            );
            indice = opciones.indexOf(seleccion);
            switch (indice){
                case 0:
                    while (true){
                      try {
                          valor = Double.valueOf(JOptionPane.showInputDialog("Ingresar la cantidad de dinero que deseas convertir"));
                          break;

                      }catch (NumberFormatException e){
                          JOptionPane.showMessageDialog(null, "Por favor ingrese valores numericos ");
                      }
                      catch (NullPointerException e){
                          break;
                      }
                    }
                    if(valor!=null){
                        int indiceMenuMoneda = opcionMoneda.MenuMoneda();
                        if(indiceMenuMoneda != -1){
                            String cambioMoneda =  opcionMoneda.ResultadoConversion(valor,indiceMenuMoneda);
                            JOptionPane.showMessageDialog(null, cambioMoneda);
                        }
                    }

                    break;
                case 1:
                    System.out.println("Elegiste temperaturas");
                    break;

            }
            int menuContinuar = JOptionPane.showOptionDialog(
                    null,
                    "¿Desea continuar?",
                    "Seleccione una opción",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,    // null para icono por defecto.
                    new Object[] { "Si", "No", "Cancelar" },   // null para YES, NO y CANCEL
                    "opcion 1");
            if(menuContinuar == -1 || menuContinuar >0){
                indice = -1;
            }

        }while (indice != -1 );


    }
}