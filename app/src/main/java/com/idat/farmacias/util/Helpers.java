package com.idat.farmacias.util;

import javax.inject.Singleton;

@Singleton
public class Helpers {

    /**
     * @param function Cualquier función que quieran ejecutar
     * @param delay Tiempo en milisegundos de retraso para
     * la ejecución de la funcion
     **/
    public static void setTimeout(Runnable function, int delay) {
        new Thread(() -> {
            try {
                Thread.sleep(delay);
                function.run();
            } catch (Exception err) {
                System.err.println(err);
            }
        }).start();
    }

}

