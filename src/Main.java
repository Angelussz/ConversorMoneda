import com.moneda.*;

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

        List<String> conversorMoneda = new ArrayList<String>();
        conversorMoneda.add("De Soles a Dolar");
        conversorMoneda.add("De Soles a Euro");
        conversorMoneda.add("De Soles a Libras");
        conversorMoneda.add("De Soles a Yen");
        conversorMoneda.add("De Soles a Won Coreano");
        conversorMoneda.add("De Dolar a Soles");
        conversorMoneda.add("De Euro a Soles");
        conversorMoneda.add("De Libras a Soles");
        conversorMoneda.add("De Yen a Soles");
        conversorMoneda.add("De Won Coreano a Soles");

        Moneda[] arrayMonedas = {new Dolar(),new Euro(),new Libras(),new Yen(), new WonCoreano()};


        Object[] opcionesArray = opciones.toArray();
        Object[] opcionesMoneda = conversorMoneda.toArray();
        Object seleccion = JOptionPane.showInputDialog(
                null, // Componente padre
                "Elige que desea convertir", // Mensaje
                "Lista con JoptionPane", // Título
                JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje
                null, // Icono
                opcionesArray, // Arreglo de opciones
                opcionesArray[0] // Opción por defecto
        );

        int indice = opciones.indexOf(seleccion);
        Double valor = null;
        if (indice == 0) {
            while (true) {
                try {
                    valor = Double.valueOf(JOptionPane.showInputDialog("Ingresar la cantidad de dinero que deseas convertir"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese valores numericos ");
                }
                catch (NullPointerException e){
                    break;
                }
            }
            if (valor != null){
                Object seleccionMoneda = JOptionPane.showInputDialog(
                        null, // Componente padre
                        "Elija la moneda a la que deseas convertir tu dinero", // Mensaje
                        "Converso Moneda", // Título
                        JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje
                        null, // Icono
                        opcionesMoneda, // Arreglo de opciones
                        opcionesMoneda[0] // Opción por defecto
                );
                int indiceMoneda = conversorMoneda.indexOf(seleccionMoneda);
                Moneda monedaActual = null;

                if(indiceMoneda>-1 && indiceMoneda < 5){
                    monedaActual = arrayMonedas[indiceMoneda];
                    String cambioMoneda = monedaActual.Convertir(valor);
                    JOptionPane.showMessageDialog(null, cambioMoneda);

                }
                else if(indiceMoneda >= 5) {

                    indiceMoneda = indiceMoneda - 5;
                    monedaActual = arrayMonedas[indiceMoneda];
                    String cambioMoneda = monedaActual.Local(valor);
                    JOptionPane.showMessageDialog(null, cambioMoneda);

                }

            }
//            ArrayList<Moneda> listaMonedas= new ArrayList<>();

        }



        System.out.println("Indice general "+indice);
        System.out.println(valor);

    }
}