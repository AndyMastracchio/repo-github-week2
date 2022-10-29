package com.digitalhouse;

import com.digitalhouse.logging.ListaPromedio;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class);
    public static void main(String[] args) {

        /*File log4jfile = new File("./config/log4j.properties");
        PropertyConfigurator.configure(log4jfile.getAbsolutePath());*/
        ListaPromedio listaPromedioMayorA5 = null;
        ListaPromedio listaPromedioMayorA10 = null;
        ListaPromedio listaPromedioVacia = null;

        try {
            listaPromedioMayorA5 = new ListaPromedio(Arrays.asList(1, 2, 3, 4, 5, 6));
            listaPromedioMayorA10 = new ListaPromedio(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
            listaPromedioVacia = new ListaPromedio(new ArrayList<>());

            System.out.println(listaPromedioMayorA5.promedio());
            System.out.println(listaPromedioMayorA10.promedio());
            System.out.println(listaPromedioVacia.promedio());
        } catch (Exception e) {
            LOGGER.error("La lista es igual a cero ", e);
        }
    }
}
