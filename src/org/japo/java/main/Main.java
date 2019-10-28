/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

    public static void main(String[] args) {

        final double PRECIO_PATATAS = 0.30;
        final double PRECIO_PIRULETA = 0.20;
        final double PRECIO_INICIAL = 1.0;

        System.out.println("Secuencia de Patatas");
        System.out.println("====================");

        System.out.println("Persona encargada....: Jaimito");
        System.out.println("Artículo encargado....: Patatas");
        System.out.println("Cantidad encargada....: 3kg");

        System.out.println("");

        System.out.printf("Precio encargo........: %.2f €/kg%n", PRECIO_PATATAS);
        System.out.printf(Locale.ENGLISH, "Dinero suministrado...: %.2f €%n", PRECIO_INICIAL);

        System.out.println("");

        System.out.println("Artículo imprevisto....: Piruleta");
        System.out.printf(Locale.ENGLISH, "Dinero imprevisto.......: %.2f €%n", PRECIO_PIRULETA);

        System.out.println("");

        //Cantidad comprada
        double cantidadComprada = PRECIO_INICIAL - PRECIO_PIRULETA;
        int cantidadDinero = (int) (cantidadComprada / PRECIO_PATATAS);

        System.out.println("Cantidad comprada........: " + cantidadDinero + " kg");

        //Dinero devuelto
        double devuelto = cantidadComprada - cantidadDinero * PRECIO_PATATAS;

        System.out.printf(Locale.ENGLISH, "Dinero devuelto..........: %.2f €%n", devuelto);

        //Dinero devuelto
    }

}
