
import com.opciones.ConversorTemperatura;
import com.opciones.OpcionMoneda;
import com.opciones.OpcionTemperatura;
import com.opciones.Ventanas;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<String> opciones = new ArrayList<>();
        opciones.add("conversor de monedas");
        opciones.add("Conversor de temeperaturas");
        OpcionMoneda opcionMoneda = new OpcionMoneda();
        OpcionTemperatura opcionTemperatura = new OpcionTemperatura();
        Object[] opcionesArray = opciones.toArray();
        Ventanas ventanas = new Ventanas();
        ConversorTemperatura[] conversores = new ConversorTemperatura[6];

        conversores[0] = x -> x* 9/5 +32;
        conversores[1] = x -> x+273.15;
        conversores[2] = x -> (x-32) * 5/9;
        conversores[3] = x -> (x-32) * 5/9 + 273.15;
        conversores[4] = x -> x-273.15;
        conversores[5] = x -> (x-273.15)*9/5 + 32;


        int indice;
        Double valor = null;
        do {
            indice = ventanas.VentanaMenu(opciones,"Eligue que deseas convertir","Lista de conversiones");
            switch (indice) {
                case 0 -> {
                    valor = ventanas.InputDataDouble("Ingresa la cantidad de dinero que deseas convertir");
                    if (valor != null) {
                        int indiceMenuMoneda = opcionMoneda.MenuMoneda();
                        if (indiceMenuMoneda != -1) {
                            String cambioMoneda = opcionMoneda.ResultadoConversion(valor, indiceMenuMoneda);
                            JOptionPane.showMessageDialog(null, cambioMoneda);
                        }
                    }
                }
                case 1 -> {
                    valor = ventanas.InputDataDouble("Ingrese el valor numerico de temperatura que desee convertir");
                    if (valor != null) {
                        int indiceMenuTemperatura = opcionTemperatura.MenuTemperatura();

                        if (indiceMenuTemperatura != -1) {
                            String cambioMoneda = "De "+opcionTemperatura.conversorMensaje(indiceMenuTemperatura)+ " es "+ conversores[indiceMenuTemperatura].conversor(valor);
                            JOptionPane.showMessageDialog(null, cambioMoneda);
                        }
                    }
                }
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