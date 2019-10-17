/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
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
import java.util.Scanner;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {
// Instanciar Scanner

    public static final Scanner SCN
            = new Scanner(System.in, "ISO-8859-1")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        String nombre;

        System.out.print("Introduzca su nombre: ");
        nombre = SCN.nextLine();

        System.out.printf("Usted se llama: %s%n", nombre);

        //Salida en mayúsculas
        System.out.printf("Usted se llama: %S%n", nombre);

        //Salida 
        System.out.printf("Usted se llama: %1$s - %1$S - %1$.1S%n", nombre);

        //Mensaje
        System.out.println("\nGracias " + nombre + " por introducir su nombre");

    }
}
